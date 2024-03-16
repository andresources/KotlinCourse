package com.kotlincourse.scopedfuns

//Apply receiver parm(input param) : this -> it remove redundancy
//Returns receiver object itself,(context of the object which refers)

//Apply used for object configuration
class Emp{
    lateinit var name:String
    lateinit var age:String
}
fun main(){
    var e = Emp()
    e.name = "KSR"
    e.age = "20"

    //above code simply written
    e.apply {
        name = "KSR"
        age = "20"
    }
    println(e.name)
}