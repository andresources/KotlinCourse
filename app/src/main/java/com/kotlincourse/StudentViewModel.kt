package com.kotlincourse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentViewModel : ViewModel() {
    var student_name = MutableLiveData<String>()
    init{
        student_name.value = "Hello"
    }

    fun updateStudentName(){
        student_name.value = "Kotlin"
    }
}