package com.kotlincourse.generics

fun main(){
    /*var emp = Emp("")
    GDemo<Emp>().display(emp)*/
    MyOperClass<Int,Float>().calFun(23,54f)
    // MyOperClass<A,B>
   //MyClass<String>().display("Hello")
   /* MyClass<String>().display("Hello")


    MyOperClass<String,String>().calFun("Hello","Hai")*/
}

data class Emp(val ename: String)

/*class GDemo{
    fun display(a:String) {
        println("$a")
    }

}*/
class GDemo<T>{
    fun display(a:T) {
        println("$a")
    }

}

class MyClass<T>{
    fun <T>display(a:T) {
        println("$a")
    }
}

class MyOperClass<A,B>{
    fun <A,B>calFun(data1: A,data2: B){
        println("$data1 - $data2")
    }
}


