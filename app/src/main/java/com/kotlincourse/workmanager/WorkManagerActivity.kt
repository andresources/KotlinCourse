package com.kotlincourse.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.kotlincourse.R

class WorkManagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work_manager)
    }

    fun startWork(view: View) {
        var workA = OneTimeWorkRequest.Builder(WorkA::class.java).build()//2.Intialization
        var workB = OneTimeWorkRequest.Builder(WorkB::class.java).build()
        var wm = WorkManager.getInstance(this@WorkManagerActivity)//3. excute work
        //wm.beginWith(listOf(workA,workB)).enqueue()
        //wm.enqueue(workA)
        wm.beginWith(workA).then(workB).enqueue();
    }
}