package com.kotlincourse.scopedfuns

/*
run vs with
we can use "run" scope fun. with ?: safe call operator to check nullability of an object, but with scope fun. with ?: is not possible.
So null check using a “ with ” operator is difficult
*/
fun main(){
    class Person{
        var name: String = "KSR"
        var age: String = "20"
    }

    var p:Person? = null
    with(p){
        println("${p?.name}")
    }
}