package com.kotlincourse.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class WorkB(appContext: Context, workerParams: WorkerParameters) : Worker(appContext,workerParams) {
    override fun doWork(): Result {
        Log.i("WM","WorkB Started")
        for (i in 11..15){
            Log.i("WM","WorkB - $i")
            try{
                Thread.sleep(1500L)
            }catch (e: Exception){}
        }
        return Result.success()
    }
}