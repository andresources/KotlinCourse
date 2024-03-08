package com.kotlincourse.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.kotlincourse.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class HiltNextActivity : AppCompatActivity() {
    @Inject
    lateinit var student: Student //Field Inject

    @Inject
    lateinit var teacher: Teacher

    lateinit var tvAddress: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_next)
        tvAddress = findViewById(R.id.tvAddress)
        tvAddress.text = "Student Address : ${student.hashCode()}\n Teacher Address :  ${teacher.hashCode()}"
    }
}