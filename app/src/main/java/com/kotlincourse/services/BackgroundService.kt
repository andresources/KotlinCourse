package com.kotlincourse.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class BackgroundService : Service() {
    override fun onCreate() {
        super.onCreate()
        Log.i("zzz","Service running on : "+Thread.currentThread().name)
        Toast.makeText(this,"onCreate()", Toast.LENGTH_LONG).show()
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this,"onStartCommand",Toast.LENGTH_LONG).show()

        //stopSelf() or stopService() manually call these methods if you override onStartCommand()

        return START_STICKY_COMPATIBILITY
    }
    override fun onBind(p0: Intent?): IBinder? {

        return null
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show()
    }
}