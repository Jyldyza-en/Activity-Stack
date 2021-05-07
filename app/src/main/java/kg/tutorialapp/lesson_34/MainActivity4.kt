package kg.tutorialapp.lesson_34

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val startDD = findViewById<Button>(R.id.button4)
        startDD.setOnClickListener{ start(this)}

        val startC = findViewById<Button>(R.id.button5)
        startC.setOnClickListener{ start(this)}

        val startA = findViewById<Button>(R.id.button6)
        startA.setOnClickListener{ start(this)}
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }

    companion object{
        fun start(context: Context){
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }
}