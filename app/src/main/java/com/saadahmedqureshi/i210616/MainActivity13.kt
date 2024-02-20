package com.saadahmedqureshi.i210616

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.m_book_session)


        val btn1=findViewById<Button>(R.id.back_mentor)

        btn1.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity10::class.java
                )
            )
        }

        val btn2=findViewById<Button>(R.id.book_appoint)

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