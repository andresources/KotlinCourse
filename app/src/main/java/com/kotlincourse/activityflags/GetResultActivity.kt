package com.kotlincourse.activityflags

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.kotlincourse.R

class GetResultActivity : AppCompatActivity() {
    lateinit var tv: TextView
    lateinit var btnAskForResult: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_result)
        tv = findViewById(R.id.tv)
        btnAskForResult = findViewById(R.id.btnAskForResult)
        btnAskForResult.setOnClickListener {
            var intent = Intent(this@GetResultActivity,SetResultActivity::class.java)
            startActivityForResult(intent,99)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode ==100){
            var ename = data?.getStringExtra("ename")
            tv.setText(ename)
        }
    }
}