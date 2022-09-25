package com.amaromerovic.kotlinoopexercises

fun main() {
    var wall = Wall(5.toDouble(), 4.toDouble());
    println("Area = ${wall.getArea()}")

    wall.height = -1.5
    println("Width = ${wall.width}")
    println("Height = ${wall.height}")
    println("Area = ${wall.getArea()}")

    var wallTwo = Wall()
    println("Area = ${wallTwo.getArea()}")
}

class Wall() {
    var width: Double? = null
        set(value) {
            field = if ((value == null) || (value.toDouble() < 0)) {
                0.0
            } else {
                value
            }

        }
    var height: Double? = null
        set(value) {
            field = if ((value == null) || (value < 0)) {
                0.0
            } else {
                value
            }
        }


    constructor(width: Double, height: Double) : this() {
        this.width = width
        this.height = height
    }


    fun getArea(): Double? {
        return width?.let { height?.times(it)}
    }
}