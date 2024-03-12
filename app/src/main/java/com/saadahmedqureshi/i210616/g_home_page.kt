package com.saadahmedqureshi.i210616

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class g_home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val layoutParams = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        }
        window.attributes = layoutParams

        setContentView(R.layout.g_home_page)

        val btn=findViewById<Button>(R.id.home_button)

        btn.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    g_home_page::class.java
                )
            )
        }
        val btn2=findViewById<Button>(R.id.search_button)

        btn2.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    h_search::class.java
                )
            )
        }
        val btn3=findViewById<Button>(R.id.chat_button)

        btn3.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    n_chat::class.java
                )
            )
        }

        val btn4=findViewById<Button>(R.id.profile_button)

        btn4.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    u_my_profile::class.java
                )
            )
        }

        val btn5=findViewById<Button>(R.id.create_button)

        btn5.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    l_add_new_mentor::class.java
                )
            )
        }

        val btn6=findViewById<Button>(R.id.notifications)

        btn6.setOnClickListener {
            startActivity(

                Intent(
                    this,
                    x_notifications::class.java
                )
            )
        }



    }
}