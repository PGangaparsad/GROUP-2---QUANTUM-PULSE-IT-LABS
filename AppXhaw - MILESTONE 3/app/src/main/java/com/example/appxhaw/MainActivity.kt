package com.example.appxhaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val courseselect = findViewById<Button>(R.id.button8)
        val learn = findViewById<Button>(R.id.button9)
        val fees = findViewById<Button>(R.id.button10)
        val contactpage = findViewById<Button>(R.id.button6)

        courseselect.setOnClickListener {
            val intent = Intent( this, courses::class.java)
            startActivity(intent)
        }
        learn.setOnClickListener {
            val intent = Intent( this, about::class.java)
            startActivity(intent)
        }
        fees.setOnClickListener {
            val intent = Intent( this, dropdown::class.java)
            startActivity(intent)
        }
        contactpage.setOnClickListener {
            val intent = Intent (this, contact::class.java)
            startActivity(intent)
        }



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
    }
}