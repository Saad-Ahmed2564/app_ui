package com.saadahmedqureshi.i210616

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_main3)

        val btn=findViewById<Button>(R.id.sign_up_button)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity4::class.java
                )
            )
        }

        val btn2=findViewById<TextView>(R.id.log)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity2::class.java
                )
            )
        }

        val home2 = findViewById<TextView>(R.id.home2)
        home2.paint.shader = LinearGradient(
            0f,0f,0f,home2.textSize, intArrayOf(
                Color.parseColor("#3EBEC5"),
                Color.parseColor("#268E93")

            ), null, Shader.TileMode.REPEAT
        )
    }
}