package com.kotlincourse.highorderfuns
//lamnda fun -> funs without function name, it has only function body.
fun main(){
    //1. calling normal fun
    normalFun()

    //2. :: function reference operator
    val myFun = ::normalFun
    myFun()

    //3. Lambda is fun. without fun name, it has only function body
     myLabdaFun()

    //4. Lambda is fun with parameters
    myLabdaSumFun(5,10)

    //5. Lambda fun with result
    val res = myLabdaSumFunWithResult(10,20)
    println("Result : $res")
}
fun normalFun(){
    println("This is normalFun")
}

fun f1() : Unit{
    println("This is normalFun")
}

val xyz: () -> Unit = {
    println("This is normalFun")
}

fun sum(a:Int, b:Int) : Int{
    val result = a + b
    return result
}

val abcd: (Int,Int) -> Int = { p, q ->
    val result: Int = p + q
    result
}


val myLabdaFun: () -> Unit ={
    println("This is lamdba fun")
}

val myLabdaSumFun: (Int,Int) -> Unit ={ a , b  ->
    val sum = a + b
    println("Sum is : $sum")
}

val myLabdaSumFunWithResult: (Int,Int) -> Int ={ a , b  ->
    val sum = a + b
    sum
}