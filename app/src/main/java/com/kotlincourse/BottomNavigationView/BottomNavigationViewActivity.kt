package com.kotlincourse.BottomNavigationView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kotlincourse.R

class BottomNavigationViewActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_view)
        bottomNav = findViewById(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    Toast.makeText(this@BottomNavigationViewActivity,"nav_home",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_gallery -> {
                    Toast.makeText(this@BottomNavigationViewActivity,"nav_gallery",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_slideshow -> {
                    Toast.makeText(this@BottomNavigationViewActivity,"nav_slideshow",Toast.LENGTH_SHORT).show()
                    true
                }

                else -> {true}
            }
        }
    }
}