package com.kotlincourse.services

import android.app.IntentService
import android.content.Intent
import android.util.Log

class WorkerThread(name: String ="MyWorkerService") : IntentService(name) {
    override fun onHandleIntent(p0: Intent?) {
        for (index in 0..20){
            Thread.sleep(2000L)
            Log.i("zzz","$index")
        }
        Log.i("zzz","Service running on : "+Thread.currentThread().name)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("zzz","Destory: ")
    }
}