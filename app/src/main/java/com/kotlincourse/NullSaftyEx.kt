package com.kotlincourse

fun main(){
    var str: String? = null
    var res = str?.length
   // print(res)

    var x: String? = null
    var y = x ?: "1"
    //print(y)

    var name: String? = "he"
    var len = name?.length ?: -100
    //print(len)

    var balanceAmount: Int? = 200000
    balanceAmount?.let{
        println("Withdraw operations")
    }
    println("End of the program")

}