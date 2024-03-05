package com.kotlincourse.BottomNavigationView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kotlincourse.FirstFragment
import com.kotlincourse.R
import com.kotlincourse.SecondFragment

class BottomNavigationViewActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_view)
        bottomNav = findViewById(R.id.bottomNav)

        var fm: FragmentManager? =supportFragmentManager
        var ft = fm!!.beginTransaction()
        var frg = MyHomeFragment()
        ft.replace(R.id.containerFragment, frg);
        ft.commit()

        bottomNav.setOnItemSelectedListener {//it = R.id.nav_home
            when (it.itemId) {
                R.id.nav_home -> {
                    var fm: FragmentManager? =supportFragmentManager
                    var ft = fm!!.beginTransaction()
                    var frg = MyHomeFragment()
                    ft.replace(R.id.containerFragment, frg);
                    ft.commit()
                    //Toast.makeText(this@BottomNavigationViewActivity,"nav_home",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_gallery -> {
                    var fm: FragmentManager? =supportFragmentManager
                    var ft = fm!!.beginTransaction()
                    var frg = FirstFragment()
                    ft.replace(R.id.containerFragment, frg);
                    ft.commit()
                    //Toast.makeText(this@BottomNavigationViewActivity,"nav_gallery",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_slideshow -> {
                    var fm: FragmentManager? =supportFragmentManager
                    var ft = fm!!.beginTransaction()
                    var frg = SecondFragment()
                    ft.replace(R.id.containerFragment, frg);
                    ft.commit()
                    Toast.makeText(this@BottomNavigationViewActivity,"nav_slideshow",Toast.LENGTH_SHORT).show()
                    true
                }

                else -> {true}
            }
        }
    }
}