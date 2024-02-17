package com.kotlincourse

class Employees{
    var ename = "Hari"
    fun f1(){
        println("This is f1")
    }
}

///fun <classname>.<your functionname>
fun Employees.f2(){
    println("This is f2:  $ename")
}

fun main(){

    var emp = Employees()
    emp.f2()
}


