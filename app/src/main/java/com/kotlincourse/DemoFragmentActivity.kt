package com.kotlincourse

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class DemoFragmentActivity : AppCompatActivity() {
    private lateinit var firstFragment: Button
    private lateinit var secondFragment: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_demo)
        firstFragment = findViewById(R.id.firstFragment)
        secondFragment = findViewById(R.id.secondFragment)
        firstFragment.setOnClickListener {
            var fm: FragmentManager? =supportFragmentManager
            var ft = fm!!.beginTransaction()
            var frg = FirstFragment()
            ft.replace(R.id.frameLayout, frg);
            ft.commit()
        }
        secondFragment.setOnClickListener {
            var fm: FragmentManager? =supportFragmentManager
            var ft = fm!!.beginTransaction()
            var frg = SecondFragment()
            ft.replace(R.id.frameLayout, frg);
            ft.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("zzz","DemoFragmentActivity - onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("zzz","DemoFragmentActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("zzz","DemoFragmentActivity - onPause")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("zzz","DemoFragmentActivity - onDestroy")
    }
}