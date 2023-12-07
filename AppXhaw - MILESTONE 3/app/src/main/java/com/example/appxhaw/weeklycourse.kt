package com.example.appxhaw

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class weeklycourse : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weeklycourse)

        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val backbtn = findViewById<Button>(R.id.button29)

        val child = findViewById<Button>(R.id.button12)
        val Cooking = findViewById<Button>(R.id.button13)
        val garden = findViewById<Button>(R.id.button14)


        child.setOnClickListener {
            val intent = Intent( this, childmining::class.java)
            startActivity(intent)
        }
        Cooking.setOnClickListener {
            val intent = Intent( this, cooking::class.java)
            startActivity(intent)
        }
        garden.setOnClickListener {
            val intent = Intent( this, gardenmain::class.java)
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

        backbtn.setOnClickListener {
            val intent = Intent ( this, courses::class.java)
            startActivity(intent)
        }
    }
}