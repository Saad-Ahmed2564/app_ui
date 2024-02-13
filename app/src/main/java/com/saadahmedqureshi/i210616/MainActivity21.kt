package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class MainActivity21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val windowManager: WindowManager = window.windowManager
        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_main21)


        val btn=findViewById<Button>(R.id.home_button)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity7::class.java
                )
            );
        }
        val btn2=findViewById<Button>(R.id.search_button)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity25::class.java
                )
            );
        }
        val btn3=findViewById<Button>(R.id.chat_button)

        btn3.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity26::class.java
                )
            );
        }

        val btn4=findViewById<Button>(R.id.profile_button)

        btn4.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity21::class.java
                )
            );
        }

        val btn5=findViewById<Button>(R.id.edit_profile)

        btn5.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity22::class.java
                )
            );
        }

        val btn6=findViewById<TextView>(R.id.booked_sessions)

        btn6.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity23::class.java
                )
            );
        }

        val btn7=findViewById<Button>(R.id.create_button)

        btn7.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity12::class.java
                )
            );
        }
    }
}