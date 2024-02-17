package com.kotlincourse.interfaces

interface I{
    abstract fun f1()
    abstract fun f2()
}
interface I1{

}

class Impl1 : I,I1{
    override fun f1() {
        println("This is f1 function")
    }
    override fun f2() {
        println("This is f2 function")
    }
}

fun main(){

    var obj = Impl1()
    obj.f1()
    obj.f2()
}