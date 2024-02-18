package com.kotlincourse.broadcast

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlincourse.R

class BroadcastReceiverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_receiver)
    }
    lateinit var airplaneBroadcastReceiver: MyBroadcastReceiver
    override fun onStart() {
        super.onStart()
        var intentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")
        airplaneBroadcastReceiver = MyBroadcastReceiver()
        registerReceiver(airplaneBroadcastReceiver, intentFilter);
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(airplaneBroadcastReceiver)
    }
}