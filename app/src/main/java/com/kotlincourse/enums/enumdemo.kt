package com.kotlincourse.enums

fun main()
{
    /*var a = "test" //a,b,c
    a = "t2"
    a = "t3"
    a = "z"
    a = "xyz"*/

    var a:MediaPlayer1  = MediaPlayer1.STOP
    when(a){
        MediaPlayer1.START -> { println("Music Started")}
        MediaPlayer1.PAUSE -> { println("Music paused")}
        MediaPlayer1.RESUME -> { println("Music resumed")}
        MediaPlayer1.STOP -> { println("Music stopped")}
        }
}

enum class MediaPlayer1{
    //predefined constants
    START, PAUSE, RESUME, STOP
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

