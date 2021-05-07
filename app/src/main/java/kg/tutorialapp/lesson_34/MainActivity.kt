package kg.tutorialapp.lesson_34

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startB = findViewById<Button>(R.id.button1)

        startB.setOnClickListener{ start(this)}
    }

    companion object{
        fun start(context: Context){
            val intent = Intent(context, MainActivity2::class.java)
            context.startActivity(intent)
        }
    }
}