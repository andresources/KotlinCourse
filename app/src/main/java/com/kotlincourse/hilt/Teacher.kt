package com.kotlincourse.hilt

import javax.inject.Inject

class Teacher @Inject constructor() {
    fun getTeacher() : String{
        return "Teacher name : ABC"
    }
}