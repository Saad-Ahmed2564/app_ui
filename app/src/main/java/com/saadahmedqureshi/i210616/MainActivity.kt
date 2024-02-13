package com.saadahmedqureshi.i210616

import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.RelativeLayout
import android.widget.TextView

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            // Intent to start the LoginPage activity
            val loginIntent = Intent(this, MainActivity2::class.java)
            startActivity(loginIntent)
            finish() // Destroy this activity so the user can't return to it
        }, 4000)

        val home2 = findViewById<TextView>(R.id.home2)
        home2.paint.shader = LinearGradient(
            0f,0f,0f,home2.textSize, intArrayOf(
                Color.parseColor("#35B3BB"),
                Color.parseColor("#1F7E86")

            ), null, Shader.TileMode.REPEAT
        )
    }
}