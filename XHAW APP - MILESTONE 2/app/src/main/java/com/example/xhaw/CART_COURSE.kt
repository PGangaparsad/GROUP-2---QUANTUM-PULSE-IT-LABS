package com.example.xhaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import cart

class CART_COURSE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart_course)

        val button = findViewById<Button>(R.id.button20)

        button.setOnClickListener {
            val intent = Intent( this, cart_2::class.java)
            startActivity(intent)
        }


    }
}