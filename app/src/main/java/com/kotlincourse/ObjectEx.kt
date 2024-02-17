package com.kotlincourse
object MySingleton{
    val ename = "Abc"
    fun f1(){
        println("This is display fun.")
    }
}
fun main(){
    MySingleton.f1()
}