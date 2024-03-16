package com.kotlincourse.scopedfuns

/*

Scope Functions:
Scope functions are functions that execute a block of code within the context of an object.

Purpose of the scope fun:
1.Scope functions make code more readable, clear and concise.We can access the members of the class without object name.(Ex: emp.Name in java).
2.Check nullability of an object( ex: let with safe call oper(?.)) and initialising an object(ex: apply)

Types of Scope Functions
Basically all scope functions perform the same action, but the difference is how an object is available inside the block and their return value.

Based on the Context of the Object(i.e. using either ‘this’ or ‘it’ keyword) and return value(i.e. either ‘context object’ or ‘lambda result’),
Scoped functions are divided into 5 functions.
1. let,
2.run,
3.with,
4.apply
 */

//let function performs operation on an object and return some result
//let is used in null safty , let execute block of the code if and only if the value not null, let is used with safe call operator(?.)
//It refers to the context of the object by using the “it” keyword and hence, this “it” can be renamed to a readable lambda parameter.
fun main(){
    basicLet()
    basicLet1()
    basicLet2()
    moreAboutLet()
    BitBank()
}
fun basicLet(){
    //let -> input : it(receiver object is refered by it)     ||       output :lambda exp.
    class Emp{
        var name = "KSR"
    }
    var res = Emp().let { // Emp obj is ref by it
        "EMP Name : ${it.name}" //it is lambda result, last statement should non assignment oper.
        // OR
        return@let "EMP Name : ${it.name}"  //Improve Readability
    }
    println("Result : $res")

    /******Imp : Last statement is not assign operator *******/
    var e1 = Emp().let {
        it.name = "KSR"//Last statement is not assign operator
    }
    println("$e1") //O/p is Kotlin Unit

}

fun basicLet1(){
    // “it” can be renamed to a readable lambda parameter.
    class Emp{
        val name = "KSR"
    }

    var res = Emp().let { person -> //it renamed with readable lambda param
        return@let "EMP Name : ${person.name}"  //Improve Readability
    }

    println("Result : $res")

}

fun basicLet2(){
    val numbers = mutableListOf("One","Two","Three","Four","Five")
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }
}

fun moreAboutLet(){
    //Ex1 : let with safe call operator(?.)
    var a : String? = null
    a?.let{//if a is null then this block will not executed
        println("Statement-1 : $it")
    }
    println("Statement-2")

    //Ex2: let, aslo
    var b = "Hello"
    //if b is not null then let and also block will excute
    b?.let {
        println("Statement-3 : $it")
    }?.also {
        println("Statement-4")
    }

    //Ex3: let, aslo and run
    var c = "Hello"
    //if c is null only "run" block execute, otherwise let and also block will execute
    c?.let{
        println("c - let block")
    }?.also {
        println("c - also block")
    }?: run{
        println("c - run block")
    }
}

fun BitBank(){
    println("******** BitBank  Start Here ********")
    //Que: 1
    class StudentCls{
        var name = ""
        var sal = ""
    }
    var e1 = StudentCls().let {
        it.name = "KSR"
        it.sal = "30000"
    }
    println("Que: 1 Output : ${e1}") //Kotlin Unit -> bz it returns last statement, in let last statement should not assign operator

    //Que: 2 the result of a call chain
    var mList = listOf("One","Two","Three")
    mList
        .map {
            it.length
        }
        .filter {
            it > 2
        }.let {
            println("$it")
        }
    //O/P  [3, 3, 5]

    //Que: 3 the result of a call chain
    var mList1 = listOf("One","Two","Three")
    mList1
        .map {
            it.length
        }
        .filter {
            it > 10
        }.let {
            println("$it")
        }
    //O/P []
    //Que: 4 the result of a call chain
    var mList2 = listOf("One","Two","Three")
    mList2
        .map {
            it.drop(1)
        }
        .filter {
            it.length > 2
        }.let {
            println("$it")
        }
    //O/P [hree]

    //Que 5: null check operation
    var str: String? = null
    var len = str?.let {
        it.length
    }?: -1
    println("$len") // O/P : -1


    println("******** BitBank  End Here ********")
}