package com.kotlincourse.highorderfuns

fun findAge(age:Int){
    if(age<18){
        println("You are youth")
    }else{
        println("You are Adult")
    }
}

fun higherOrderFunction(fn: (Int) -> Unit,age : Int){
    fn(age)
}

fun main(){
    higherOrderFunction(::findAge,30)
}