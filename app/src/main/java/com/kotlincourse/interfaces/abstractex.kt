package com.kotlincourse.interfaces
open class B{

}


abstract class A{
    abstract fun f1() //abstract fun
    abstract fun f3()
    fun f2(){ //non-abstract fun
        println("This is f2 function")
    }
}

class ImplA : A(){
    override fun f1() {
        println("This is f1 function")
    }

    override fun f3() {

    }
}

fun main(){
    var obj = ImplA()
    obj.f1()
    obj.f2()
    obj.f3()
}
