package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.reset_password)

        val btn=findViewById<TextView>(R.id.log3)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity2::class.java
                )
            )
        }

        val btn2=findViewById<Button>(R.id.reset_button)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity2::class.java
                )
            )
        }
        val btn3=findViewById<Button>(R.id.back_forgot)
        btn3.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity5::class.java
                )
            )
        }

    }
}