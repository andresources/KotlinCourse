package com.kotlincourse.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import com.kotlincourse.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutinesMainActivity : AppCompatActivity() {
    lateinit var btnStart: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_main)
        btnStart = findViewById(R.id.btnStart)
        btnStart.setOnClickListener {
            loadDataFromNetwork()
             /*lifecycleScope.launch(Dispatchers.IO) {
                 loadDataFromNetwork()
            }*/
        }


    }
      fun loadDataFromNetwork(){
        for (index in 0..5){
            Thread.sleep(2000L)
            Log.i("zzz","$index")
        }
    }
}