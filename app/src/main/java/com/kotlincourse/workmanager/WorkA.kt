package com.kotlincourse.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class WorkA(appContext: Context, workerParams: WorkerParameters) : Worker(appContext,workerParams) {
    override fun doWork(): Result {
        Log.i("WM","WorkA Started")
        for (i in 1..5){
            Log.i("WM","WorkA - $i")
            try{
                Thread.sleep(1000L)
            }catch (e: Exception){}
        }
        return Result.success()
    }
}