package com.kotlincourse

import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@OptIn(ExperimentalTime::class)
fun main(){

    Thread{
        f1()
    }.start()

    Thread{
        f2()
    }.start()

}
fun f1(){
    println("F1 Execution Start")
   for (i in 1..5)
   {
       try {
           Thread.sleep(1000)
       }catch (e: Exception){}
       println("$i")
   }
    println("F1 Execution End")
}

fun f2(){
    println("F2 Execution Start")
    for (i in 11..15)
    {
        try {
            Thread.sleep(2000)
        }catch (e: Exception){}
        println("$i")
    }
    println("F2 Execution End")
}