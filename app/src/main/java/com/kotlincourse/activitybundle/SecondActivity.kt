package com.kotlincourse.activitybundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.kotlincourse.R

class SecondActivity : AppCompatActivity() {
    lateinit var tvDetails: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var bundle = intent.extras
        tvDetails = findViewById(R.id.tvDetails)
        var firstName = bundle!!.getString(FIRST_NAME)
        var last = bundle!!.getString(LAST_NAME)
        tvDetails.setText(firstName)
    }
}