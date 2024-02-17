package com.kotlincourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class HomeScreenActivity : AppCompatActivity() {
     lateinit var tv: TextView
     lateinit var checkBox: CheckBox
    //var x: String //Declaration
    // x = "Abc" //Initialization
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        var un = intent.getStringExtra("user_name")
        var password = intent.getStringExtra("pwd")
        var fg = intent.getBooleanExtra("chb",false) //fg = true
        tv = findViewById(R.id.tv)
        tv.setText("UserName : $un Password : $password")

        checkBox= findViewById(R.id.checkBox)
        checkBox.isChecked = fg
    }
}