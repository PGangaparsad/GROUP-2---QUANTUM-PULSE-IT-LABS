package com.example.appxhaw


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.LinearLayout
import java.text.DecimalFormat

class invoice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invoice)


        val itemsLayout = findViewById<LinearLayout>(R.id.itemsLayout)
        val totalTextView = findViewById<TextView>(R.id.totalTextView)
        val subTotalTextView = findViewById<TextView>(R.id.subTotalTextView)
        val taxTextView = findViewById<TextView>(R.id.taxTextView)
        val discountTextView = findViewById<TextView>(R.id.discountTextView)

        val navHome = findViewById<Button>(R.id.button1)
        val navAbout = findViewById<Button>(R.id.button2)
        val navCourse = findViewById<Button>(R.id.button3)
        val navCalc = findViewById<Button>(R.id.button4)
        val navContact = findViewById<Button>(R.id.button5)

        val backbtn = findViewById<Button>(R.id.button30)

        val meeting = findViewById<Button>(R.id.button7)

        meeting.setOnClickListener {
            val intent = Intent( this, calculator::class.java)
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
            val intent = Intent ( this, dropdown::class.java)
            startActivity(intent)
        }

        val number1Selected = intent.getBooleanExtra("number1Selected", false)
        val number2Selected = intent.getBooleanExtra("number2Selected", false)
        val number3Selected = intent.getBooleanExtra("number3Selected", false)
        val number4Selected = intent.getBooleanExtra("number4Selected", false)

        val number5Selected = intent.getBooleanExtra("number5Selected", false)
        val number6Selected = intent.getBooleanExtra("number6Selected", false)
        val number7Selected = intent.getBooleanExtra("number7Selected", false)

        val selectedNumbers = mutableListOf<Int>()

        if (number1Selected) {
            itemsLayout.addView(createItemTextView("FIRST AIDS: R1500"))
            selectedNumbers.add(1500)
        }
        if (number2Selected) {
            itemsLayout.addView(createItemTextView("SEWING: R1500"))
            selectedNumbers.add(1500)
        }
        if (number3Selected) {
            itemsLayout.addView(createItemTextView("LANSCAPING: R1500"))
            selectedNumbers.add(1500)
        }
        if (number4Selected) {
            itemsLayout.addView(createItemTextView("LIFE SKILLS: R1500"))
            selectedNumbers.add(1500)
        }
        if (number5Selected) {
            itemsLayout.addView(createItemTextView("CHILD MINDING: R750"))
            selectedNumbers.add(750)
        }
        if (number6Selected) {
            itemsLayout.addView(createItemTextView("COOKING: R750"))
            selectedNumbers.add(750)
        }
        if (number7Selected) {
            itemsLayout.addView(createItemTextView("GARDEN MAINTENANCE: R750"))
            selectedNumbers.add(750)
        }

        val courseCount = selectedNumbers.size
        val subtotal = selectedNumbers.sum()

        // Calculate the discount based on the number of courses
        val discount = when (courseCount) {
            1 -> 0 // No discount
            2 -> (subtotal * 0.05).toInt() // 5% discount
            3 -> (subtotal * 0.1).toInt() // 10% discount
            else -> (subtotal * 0.15).toInt() // More than three courses, 15% discount
        }

        val sum = selectedNumbers.sum()
        val vat = sum * 0.15
        val total = sum + vat

        val decimalFormat = DecimalFormat("0.00")
        subTotalTextView.text = "Sub-Total: R${decimalFormat.format(sum)}"
        taxTextView.text = "Tax (15%): R${decimalFormat.format(vat)}"
        discountTextView.text = "Discount: R${decimalFormat.format(discount)}"
        totalTextView.text = "Total: R${decimalFormat.format(total)}"
    }

    private fun createItemTextView(text: String): TextView {
        val itemTextView = TextView(this)
        itemTextView.text = text
        itemTextView.textSize = 18f
        return itemTextView
    }
}