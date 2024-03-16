package com.kotlincourse.enums

fun main()
{
    /*var a = "test"
    a = "t2"
    a = "t3"*/
    var play = Play.START
    var message = when(play)
    {
        Play.START -> "Music started"
        Play.PAUSE -> "Music paused"
        Play.STOP -> "Music stopped"
    }
    println(message)
}

enum class Play{
    START, PAUSE, STOP
}

enum class Weekend(val value: Int) {
    SATURDAY(0), SUNDAY(1),MONDAY(2)
}

enum class Status(val type: String) {
    INVITED("invite"),
    ACTIVATED("active"),
    DELETED("delete"),
}


enum class RATEOFINTEREST(val value: Float) {
    SBI(6.5f),HDFC(7.5f),ICICI(8.5f)
}

