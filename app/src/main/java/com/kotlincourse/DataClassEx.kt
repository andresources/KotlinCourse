package com.kotlincourse


data class EmpDataClass(var ename: String,var esal: Int,var deptno: Int)
//data class <EMp>(list of properties)
fun main(){
    //{"abc",20000,12},{"abc1",10000,10}

    var list  = mutableListOf<EmpDataClass>()
    var emp1 = EmpDataClass("abc",20000,12)
    list.add(emp1)

    var emp2 = EmpDataClass("abc1",10000,10)
    list.add(emp2)

    for (item in list){
        println(item.ename + " - "+item.deptno +" - "+item.deptno)
    }
}