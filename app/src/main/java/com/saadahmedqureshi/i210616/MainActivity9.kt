package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity9 : AppCompatActivity() {
    val players = arrayOf("Filter","Ascending","Descending")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val windowManager: WindowManager = window.windowManager
        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.activity_main9)
        val spin_f=findViewById<Spinner>(R.id.spinner_filter)
        val arrayadapt = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, players)
        spin_f.adapter = arrayadapt


        val btn12=findViewById<View>(R.id.sample1)

        btn12.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity10::class.java
                )
            );
        }



        val btn=findViewById<Button>(R.id.home_button)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity7::class.java
                )
            );
        }
        val btn2=findViewById<Button>(R.id.search_button)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity25::class.java
                )
            );
        }
        val btn3=findViewById<Button>(R.id.chat_button)

        btn3.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity26::class.java
                )
            );
        }

        val btn4=findViewById<Button>(R.id.profile_button)

        btn4.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity21::class.java
                )
            );
        }

        val btn5=findViewById<Button>(R.id.create_button)

        btn5.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity12::class.java
                )
            );
        }

        val btn15=findViewById<Button>(R.id.back_Signup)

        btn15.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    MainActivity25::class.java
                )
            );
        }


    }
}