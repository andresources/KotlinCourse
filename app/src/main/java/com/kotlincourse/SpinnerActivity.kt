package com.kotlincourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class SpinnerActivity : AppCompatActivity() {
    lateinit var sp: Spinner
    lateinit var btnSubmit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
        sp = findViewById(R.id.sp)
        btnSubmit = findViewById(R.id.btnSubmit)
        btnSubmit.setOnClickListener {
            var str = sp.selectedItem.toString()
            Toast.makeText(this@SpinnerActivity,str,Toast.LENGTH_SHORT).show()
        }
    }
}