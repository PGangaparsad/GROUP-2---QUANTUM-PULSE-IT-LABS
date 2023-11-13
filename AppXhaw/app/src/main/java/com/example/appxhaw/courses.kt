package com.example.appxhaw

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class courses : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val sixMonth = findViewById<Button>(R.id.button)
        val sixWeek = findViewById<Button>(R.id.button11)

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


        sixMonth.setOnClickListener {
            val intent = Intent ( this, monthlycourse::class.java)
            startActivity(intent)
        }

        sixWeek.setOnClickListener {
            val intent = Intent ( this, weeklycourse::class.java)
            startActivity(intent)
        }
    }
}