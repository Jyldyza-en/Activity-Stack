package kg.tutorialapp.lesson_34

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val startD = findViewById<Button>(R.id.button3)

        startD.setOnClickListener{ start(this)}
    }

    companion object{
        fun start(context: Context){
            val intent = Intent(context, MainActivity4::class.java)
            context.startActivity(intent)
        }
    }
}