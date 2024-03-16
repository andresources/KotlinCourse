package com.kotlincourse.scopedfuns

//Apply receiver parm(input param) : it -> renamed with lambda parm
//Returns receiver object itself,(context of the object which refers)

//Use also for additional actions such as logging or printing debug information.
class Employee{
    lateinit var name:String
    lateinit var age:String
}
fun main(){
    var e1 = Employee()
    e1.also {
            employee ->
        employee.name = "KSR"
        employee.age = "20"
    }
    println(e1.name)
}