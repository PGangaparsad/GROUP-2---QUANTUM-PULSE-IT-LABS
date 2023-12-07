package com.example.xhaw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import cart
import com.example.xhaw.databinding.ActivityMain2Binding
import com.example.xhawapp.Home
import courses

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    replaceFragment(Home())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.about -> {
                    replaceFragment(About())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.course -> {
                    replaceFragment(courses())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.cart -> {
                    replaceFragment(cart())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.contact -> {
                    replaceFragment(Contact())
                    return@setOnNavigationItemSelectedListener true
                }
                else -> return@setOnNavigationItemSelectedListener false
            }
        }


        binding.bottomNavigationView.selectedItemId = R.id.home
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}