package com.kotlincourse.generics

fun main(){
    //GDemo().display("Testing")
    MyClass<String>().display("Hello")
   /* MyClass<String>().display("Hello")

    MyOperClass<Int,Float>().calFun(23,54f)
    MyOperClass<String,String>().calFun("Hello","Hai")*/
}

class MyClass<T>{
    fun display(a:T) {
        println("$a")
    }
}

class MyOperClass<A,B>{
    fun <A,B>calFun(data1: A,data2: B){
        println("$data1 - $data2")
    }
}


class GDemo{
    fun display(a:String) {
        println("$a")
    }
}