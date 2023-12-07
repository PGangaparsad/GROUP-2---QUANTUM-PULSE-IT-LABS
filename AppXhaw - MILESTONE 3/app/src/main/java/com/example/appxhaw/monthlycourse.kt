package com.example.appxhaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class monthlycourse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monthlycourse)

        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val backbtn = findViewById<Button>(R.id.button28)

        val firstAid = findViewById<Button>(R.id.button17)
        val Sewing = findViewById<Button>(R.id.button15)
        val Landscaping = findViewById<Button>(R.id.button16)
        val Lifeskill = findViewById<Button>(R.id.button18)



        firstAid.setOnClickListener {
            val intent = Intent( this, firstaid::class.java)
            startActivity(intent)
        }
        Sewing.setOnClickListener {
            val intent = Intent( this, sewing::class.java)
            startActivity(intent)
        }
        Landscaping.setOnClickListener {
            val intent = Intent( this, landscaping::class.java)
            startActivity(intent)
        }
        Lifeskill.setOnClickListener {
            val intent = Intent( this, lifeskills::class.java)
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