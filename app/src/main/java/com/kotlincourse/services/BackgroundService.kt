package com.kotlincourse.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class BackgroundService : Service() {
    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this,"onCreate()", Toast.LENGTH_LONG).show()
    }
    override fun onBind(p0: Intent?): IBinder? {
        Toast.makeText(this,"onBind()", Toast.LENGTH_LONG).show()
        return null
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show()
    }
}