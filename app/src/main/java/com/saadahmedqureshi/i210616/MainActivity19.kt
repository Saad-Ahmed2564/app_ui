package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.video_call)

        val btn=findViewById<Button>(R.id.reconnect)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity20::class.java
                )
            )
        }
        val btn1=findViewById<Button>(R.id.reconnect2)

        btn1.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity20::class.java
                )
            )
        }

        val btn2=findViewById<Button>(R.id.cancel_call1)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity15::class.java
                )
            )
        }

        val btn3=findViewById<Button>(R.id.cancel_call2)

        btn3.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity15::class.java
                )
            )
        }
    }
}