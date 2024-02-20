package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams


        setContentView(R.layout.add_new_mentor)


        val btn10=findViewById<Button>(R.id.take_video)

        btn10.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity18::class.java
                )
            )
        }

        val btn11=findViewById<Button>(R.id.take_photo)

        btn11.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity17::class.java
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
        val btn2=findViewById<Button>(R.id.search_button)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity25::class.java
                )
            )
        }
        val btn3=findViewById<Button>(R.id.chat_button)

        btn3.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity26::class.java
                )
            )
        }

        val btn4=findViewById<Button>(R.id.profile_button)

        btn4.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity21::class.java
                )
            )
        }

        val btn5=findViewById<Button>(R.id.create_button)

        btn5.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity12::class.java
                )
            )
        }


        val btn12=findViewById<Button>(R.id.back_Signup)

        btn12.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity7::class.java
                )
            )
        }

        val btn13=findViewById<Button>(R.id.upload)

        btn13.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity7::class.java
                )
            )
        }

    }
}