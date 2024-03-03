package com.kotlincourse.sharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.kotlincourse.R

class SharedPrefActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var btnSave: Button
    lateinit var btnGet: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_pref)
        var sharedPref = getSharedPreferences("MyData", MODE_PRIVATE)
        etName = findViewById(R.id.etName)
        btnSave = findViewById(R.id.btnSave)
        btnGet = findViewById(R.id.btnGet)
        btnGet.setOnClickListener {
            var str = sharedPref.getString("ename","def-value")
            Toast.makeText(applicationContext,str,Toast.LENGTH_SHORT).show()
        }
        btnSave.setOnClickListener {
            var str = etName.text.toString()
            var editor = sharedPref.edit()
            editor.putString("ename",str)
            editor.putBoolean("gender",true)
            editor.commit()
        }
    }
}