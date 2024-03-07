package com.kotlincourse.hilt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import com.kotlincourse.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltDemoActivity : AppCompatActivity() {
    @Inject
    lateinit var student: Student // Or var obj  = Student()

    @Inject
    lateinit var teacher: Teacher // Or var teacher = Teacher()

    lateinit var tv: TextView
    lateinit var tvAddress: TextView
    lateinit var btnGotoNextActivity : Button
    val viewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_demo)
        student.getName()

        tv = findViewById(R.id.tv)
        tvAddress = findViewById(R.id.tvAddress)
        btnGotoNextActivity = findViewById(R.id.btnGotoNextActivity)
        btnGotoNextActivity.setOnClickListener {
            startActivity(Intent(this@HiltDemoActivity,HiltNextActivity::class.java))
        }
        tvAddress.text = "Student Address : ${student.hashCode()}\nTeacher Address : ${teacher.hashCode()}"
        //tv.setText(student.getName())
        val teacherName = viewModel.getTeacher()
        tv.setText(teacherName)
    }
}