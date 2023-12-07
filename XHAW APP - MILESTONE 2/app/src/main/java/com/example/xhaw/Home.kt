package com.example.xhawapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.xhaw.R

class Home: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the buttons by their IDs
        val button1 = rootView.findViewById<Button>(R.id.button)
        val button2 = rootView.findViewById<Button>(R.id.button2)
        val button3 = rootView.findViewById<Button>(R.id.button3)
        val button4 = rootView.findViewById<Button>(R.id.button4)

        // Set click listeners for the buttons if needed
        button1.setOnClickListener {

        }

        button2.setOnClickListener {

        }

        button3.setOnClickListener {

        }

        button4.setOnClickListener {

        }

        return rootView
    }
}
