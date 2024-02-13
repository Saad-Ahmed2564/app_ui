package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_main11)

        val btn1=findViewById<Button>(R.id.back_mentor)

        btn1.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity10::class.java
                )
            )
        }


        val btn2=findViewById<Button>(R.id.submit_feedback)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity10::class.java
                )
            )
        }

    }
}