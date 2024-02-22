package com.kotlincourse

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun doAPICalls(completeListener: (name: String) -> Unit = {}){
    var str = "KSR"
    var res = Repo().getAllData(str)
    completeListener.invoke(res)
}

class Repo{
    fun getAllData(str: String) : String  {
         Thread.sleep(5000L)
        return "Data from $str"
    }
}

fun main(){
    println("Asking server...")
    doAPICalls{
        println("$it")
        println("Completed...")
    }
}