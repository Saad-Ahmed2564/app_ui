package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class e_forgot_password : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.e_forgot_password)

        val btn2=findViewById<Button>(R.id.send_button)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    f_reset_password::class.java
                )
            )
        }

        val btn=findViewById<TextView>(R.id.log2)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    b_Login::class.java
                )
            )
        }

        val btn3=findViewById<Button>(R.id.back_login)

        btn3.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    b_Login::class.java
                )
            )
        }



    }
}