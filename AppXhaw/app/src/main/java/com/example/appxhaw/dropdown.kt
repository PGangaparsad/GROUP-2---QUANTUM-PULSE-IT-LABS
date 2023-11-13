package com.example.appxhaw

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.TextView

class dropdown : AppCompatActivity() {

    private val selectedItems = ArrayList<String>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dropdown)

        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val number1CheckBox = findViewById(R.id.number1CheckBox) as CheckBox
        val number2CheckBox = findViewById(R.id.number2CheckBox) as CheckBox
        val number3CheckBox = findViewById(R.id.number3CheckBox) as CheckBox
        val number4CheckBox = findViewById(R.id.number4CheckBox) as CheckBox

        val number5CheckBox = findViewById(R.id.number5CheckBox) as CheckBox
        val number6CheckBox = findViewById(R.id.number6CheckBox) as CheckBox
        val number7CheckBox = findViewById(R.id.number7CheckBox) as CheckBox



        val calc = findViewById<Button>(R.id.calculateButton)

        calc.setOnClickListener {
            val intent = Intent(this, invoice::class.java)
            intent.putExtra("number1Selected", number1CheckBox.isChecked)
            intent.putExtra("number2Selected", number2CheckBox.isChecked)
            intent.putExtra("number3Selected", number3CheckBox.isChecked)
            intent.putExtra("number4Selected", number4CheckBox.isChecked)
            intent.putExtra("number5Selected", number5CheckBox.isChecked)
            intent.putExtra("number6Selected", number6CheckBox.isChecked)
            intent.putExtra("number7Selected", number7CheckBox.isChecked)
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