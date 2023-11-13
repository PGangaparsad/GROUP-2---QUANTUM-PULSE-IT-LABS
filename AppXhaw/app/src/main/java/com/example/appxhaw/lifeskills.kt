package com.example.appxhaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView

class lifeskills : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifeskills)
        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val backbtn = findViewById<Button>(R.id.button26)

        val list = findViewById<Button>(R.id.button20)

        val bulletPointsText = """
    <ul>
        <li>Opening a bank account</li>
        <li> Basic labour law (know your rights)</li>
        <li>Basic reading and writing literacy</li>
        <li>Basic numeric literacy</li>
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
            val intent = Intent( this, dropdown::class.java)
            startActivity(intent)
        }

        navContact.setOnClickListener {
            val intent = Intent (this, contact::class.java)
            startActivity(intent)
        }


        list.setOnClickListener {
            val intent = Intent ( this, dropdown::class.java)
            startActivity(intent)
        }

        backbtn.setOnClickListener {
            val intent = Intent ( this, monthlycourse::class.java)
            startActivity(intent)
        }
    }
}