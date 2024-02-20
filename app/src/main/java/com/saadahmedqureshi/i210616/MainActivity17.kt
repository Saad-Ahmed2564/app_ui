package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.add_photo)

        val btn=findViewById<Button>(R.id.video)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity18::class.java
                )
            )
        }

        val btn1=findViewById<Button>(R.id.video_2)

        btn1.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity18::class.java
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