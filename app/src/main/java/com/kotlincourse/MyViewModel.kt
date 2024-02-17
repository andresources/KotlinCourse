package com.kotlincourse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
data class StudentDets(val stdName: String)
class MyViewModel : ViewModel() {
    var liveDataStudentName = MutableLiveData<String>()
    init {
        liveDataStudentName.value = "Hello"
    }
    fun updateLiveData(){
        liveDataStudentName.value = "Android"
    }

}