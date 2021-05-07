package kg.tutorialapp.lesson_34

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val startC = findViewById<Button>(R.id.button2)

        startC.setOnClickListener{ start(this)}
    }

    companion object{
        fun start(context: Context){
            val intent = Intent(context, MainActivity3::class.java)
            context.startActivity(intent)
        }
    }
}