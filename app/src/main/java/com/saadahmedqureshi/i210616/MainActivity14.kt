package com.saadahmedqureshi.i210616


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager


class MainActivity14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_main14)


    }
}