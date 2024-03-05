package com.kotlincourse.activitybundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kotlincourse.R

class FirstActivity : AppCompatActivity() {
    lateinit var btnGotoSecondActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        btnGotoSecondActivity = findViewById(R.id.btnGotoSecondActivity)
        btnGotoSecondActivity.setOnClickListener {

           var bundle = Bundle().apply {
                putString("first_name","First-Name")
                putString("middle_name","Middle")
                putString("last_name","Last")
                putString("age","25Y")
                putString("place","hyderabad")
            }
            var intent = Intent(this@FirstActivity,SecondActivity::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)
        }
    }
}