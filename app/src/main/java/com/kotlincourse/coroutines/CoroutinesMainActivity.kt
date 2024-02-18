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
    //Long Running Tasks : DB Operation, File operation, Network Operation
    lateinit var btnStart: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines_main)
        Log.i("zzz","onCreate is running on thread : ${Thread.currentThread().name}")
        btnStart = findViewById(R.id.btnStart)
        btnStart.setOnClickListener {
            //loadDataFromNetwork()
             /*Thread{
                 loadDataFromNetwork()
             }.start()*/
            lifecycleScope.launch(Dispatchers.IO){
                loadDataFromNetwork()
            }

        }


    }
      suspend fun loadDataFromNetwork(){ //40Sec
          Log.i("zzz","loadDataFromNetwork is running on thread : ${Thread.currentThread().name}")
            for (index in 0..20){
                Thread.sleep(2000L)
                Log.i("zzz","$index")
            }
    }
}