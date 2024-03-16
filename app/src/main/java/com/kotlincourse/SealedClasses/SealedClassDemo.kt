package com.kotlincourse.SealedClasses

import com.kotlincourse.enums.Play

sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
}
fun main(){
    var e: Shape = Shape.Circle(10.5f)
    when (e) {
        is Shape.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square -> println("Square area is ${e.length*e.length}")
        is Shape.Rectangle -> println("Rectagle area is ${e.length*e.breadth}")
    }
}
