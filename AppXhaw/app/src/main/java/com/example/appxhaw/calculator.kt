package com.example.appxhaw

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class calculator : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val submit = findViewById<Button>(R.id.button19)

        val backbtn = findViewById<Button>(R.id.button31)



        navHome.setOnClickListener {
            val intent = Intent( this, MainActivity::class.java)
            startActivity(intent)
        }

        navAbout.setOnClickListener {
            val intent = Intent( this, about::class.java)
            startActivity(intent)
        }

        navCourse.setOnClickListener {
            val intent = Intent( this, courses::class.java)
            startActivity(intent)
        }

        navCalc.setOnClickListener {
            val intent = Intent( this, dropdown::class.java)
            startActivity(intent)
        }

        navContact.setOnClickListener {
            val intent = Intent (this, contact::class.java)
            startActivity(intent)
        }

        backbtn.setOnClickListener {
            val intent = Intent ( this, invoice::class.java)
            startActivity(intent)
        }

        submit.setOnClickListener {
            val message = "FORM SUBMITTED"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }


    }
}