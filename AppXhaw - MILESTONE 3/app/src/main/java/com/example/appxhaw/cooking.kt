package com.example.appxhaw

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView

class cooking : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking)
        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val backbtn = findViewById<Button>(R.id.button23)

        val list = findViewById<Button>(R.id.button20)

        val bulletPointsText = """
    <ul>
        <li>WNutritional requirements for a healthy body</li>
        <li>Types of protein, carbohydrates and vegetables</li>
        <li>Planning meals</li>
        <li>Preparation and cooking of meals</li>
    </ul>
"""

        val bulletPointsTextView = findViewById<TextView>(R.id.bulletPointsTextView)
        bulletPointsTextView.text = Html.fromHtml(bulletPointsText, Html.FROM_HTML_MODE_LEGACY)


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
            val intent = Intent( this, calculator::class.java)
            startActivity(intent)
        }

        navContact.setOnClickListener {
            val intent = Intent (this, dropdown::class.java)
            startActivity(intent)
        }


        list.setOnClickListener {
            val intent = Intent ( this, dropdown::class.java)
            startActivity(intent)
        }

        backbtn.setOnClickListener {
            val intent = Intent ( this, weeklycourse::class.java)
            startActivity(intent)
        }
    }
}