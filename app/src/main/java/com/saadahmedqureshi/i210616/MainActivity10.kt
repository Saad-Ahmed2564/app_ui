package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.mentor_profile)

        val btn1=findViewById<TextView>(R.id.review)

        btn1.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity11::class.java
                )
            )
        }
        val btn2=findViewById<Button>(R.id.back)

        btn2.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity9::class.java
                )
            )
        }

        val btn3=findViewById<Button>(R.id.book_sess)

        btn3.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity13::class.java
                )
            )
        }
    }
}