package com.kotlincourse.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, p1: Intent?) {
        Toast.makeText(context,"Airplane mode",Toast.LENGTH_LONG).show()
        Log.i("zzz","Airplane mode")
    }
}