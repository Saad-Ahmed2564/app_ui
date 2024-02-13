package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_main18)

        val btn=findViewById<Button>(R.id.photo_button1)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity17::class.java
                )
            )
        }

        val btn1=findViewById<Button>(R.id.photo_button2)

        btn1.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity17::class.java
                )
            )
        }

        val btn2=findViewById<Button>(R.id.start_vid)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity19::class.java
                )
            )
        }

        val btn3=findViewById<Button>(R.id.back)

        btn3.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity12::class.java
                )
            )
        }
    }
}