package com.kotlincourse.scopedfuns

/****
run vs let
----------
run referces to the context of an object is "this" -> remove the redunacy
let referces to the context of an object is "it" ->  it can be renamed with  readable lambda parameter.
The “ run ” operator also helps in easy null checks similar to the “ let ” operator

 ****/
class Student{
    var name: String = "Hello"
}
fun main(){
    //Ex1:
    var std:Student? = null
    std?.run {
        println("$this")
    }

    with(std){
        println("${this?.name}")
    }

}