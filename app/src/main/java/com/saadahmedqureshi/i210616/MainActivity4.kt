package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.verify)


        val btn=findViewById<TextView>(R.id.verify_button)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity2::class.java
                )
            )
        }

        val btn2=findViewById<Button>(R.id.back_Signup)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity3::class.java
                )
            )
        }
    }
}