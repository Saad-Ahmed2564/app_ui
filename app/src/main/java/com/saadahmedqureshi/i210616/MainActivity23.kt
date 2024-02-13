package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class MainActivity23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_main23)

        val btn6=findViewById<Button>(R.id.back_profile)

        btn6.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity21::class.java
                )
            )
        }
    }
}