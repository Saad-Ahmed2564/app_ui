package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.o_mentor_chat)

        val btn1=findViewById<Button>(R.id.phone_call)

        btn1.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity20::class.java
                )
            )
        }

        val btn2=findViewById<Button>(R.id.video_call)

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
                    MainActivity26::class.java
                )
            )
        }


        val btn=findViewById<Button>(R.id.home_button)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity7::class.java
                )
            )
        }
        val btn4=findViewById<Button>(R.id.search_button)

        btn4.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity25::class.java
                )
            )
        }
        val btn5=findViewById<Button>(R.id.chat_button)

        btn5.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity26::class.java
                )
            )
        }

        val btn6=findViewById<Button>(R.id.profile_button)

        btn6.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity21::class.java
                )
            )
        }

        val btn7=findViewById<Button>(R.id.create_button)

        btn7.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity12::class.java
                )
            )
        }
    }
}