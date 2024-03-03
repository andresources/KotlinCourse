package com.kotlincourse.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import com.kotlincourse.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltDemoActivity : AppCompatActivity() {
    @Inject
    lateinit var student: Student
    lateinit var tv: TextView
    val viewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_demo)
        tv = findViewById(R.id.tv)
        //tv.setText(student.getName())
        val teacherName = viewModel.getTeacher()
        tv.setText(teacherName)
    }
}