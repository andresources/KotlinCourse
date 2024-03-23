package com.kotlincourse.highorderfuns

fun findAge(age:Int){ //Int is param
    if(age<18){
        println("You are youth")
    }else{
        println("You are Adult")
    }
}

val fn:(Int) -> Unit = { age ->
    if(age<18){
        println("You are youth")
    }else{
        println("You are Adult")
    }
}

fun sumOf2(a: Int,b: Int) : Unit{
    val total = a + b
    println(total)
}
val sm:(Int,Int) -> Unit = { a,b ->
    val total = a + b
    println(total)
}

//Higher Order fun is a fun which accept another fun as param.
fun higherOrderFunction(fn:(Int,Int) -> Unit,age : Int){ //fun and Int are params
    fn(age)
}

fun main(){
 //higherOrderFunction(::findAge,30)
    higherOrderFunction(::sumOf2,30)
}