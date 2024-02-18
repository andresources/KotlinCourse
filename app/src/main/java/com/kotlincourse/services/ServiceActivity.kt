package com.kotlincourse.services

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.kotlincourse.R
import com.kotlincourse.broadcast.MyBroadcastReceiver

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
    }


    fun startService(view: View) {
        startService(Intent(this,WorkerThread("")::class.java))
    }
    fun stopService(view: View) {
        stopService((Intent(this,BackgroundService::class.java)))
    }



    override fun onDestroy() {
        super.onDestroy()

    }
}