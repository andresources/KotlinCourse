package com.kotlincourse

import android.util.Log
import java.lang.Exception
import kotlin.concurrent.thread

class Employee constructor() { //Heavy class
    //Image Load : 50KB
    init {
        try {
            Thread.sleep(5000)//5 sec
        }catch (e: Exception){}
        Log.e("zzz","Employee object is created... And Image also loaded : 50KB Size")
    }
    fun display() : String{
        return "This is display function..."
    }
}