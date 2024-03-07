package com.kotlincourse.hilt

import javax.inject.Inject

class Student @Inject constructor() {
    fun getName() : String = "This is KSR"
}