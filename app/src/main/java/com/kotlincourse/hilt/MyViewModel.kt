package com.kotlincourse.hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(private val teacher: Teacher) : ViewModel(){
    fun getTeacher() : String{
        return teacher.getTeacher()
    }
}