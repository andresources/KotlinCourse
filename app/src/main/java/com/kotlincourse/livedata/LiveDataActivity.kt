package com.kotlincourse.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.kotlincourse.R
import com.kotlincourse.StudentViewModel

class LiveDataActivity : AppCompatActivity() {

    lateinit var tvStudentName: TextView
    lateinit var btnUpdate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        tvStudentName = findViewById(R.id.tvStudentName)
        btnUpdate = findViewById(R.id.btnUpdate)
        val studentViewModel = ViewModelProvider(this).get(StudentViewModel::class.java)

        studentViewModel.student_name.observe(this,{
            tvStudentName.setText(it)
        })
        btnUpdate.setOnClickListener {
            studentViewModel.updateStudentName()
        }



    }
}
//var liveDataStudentName = MutableLiveData<String>()

/*
val viewModel: MyViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
viewModel.liveDataStudentName.observe(this,{
    tvStudentName.setText(it)
})*/

//viewModel.updateLiveData()

//student_name = "Android" //Hello -> Android

//liveDataStudentName.value = "Android"
