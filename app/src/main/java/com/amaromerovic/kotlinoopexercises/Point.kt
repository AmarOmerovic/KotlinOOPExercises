package com.amaromerovic.kotlinoopexercises

import kotlin.math.sqrt

fun main() {
    var first = Point(6, 5)
    var second = Point(3, 1)
    println("Distance(0,0) = ${first.distance()}")
    println("Distance(second) = ${first.distance(second)}")
    println("Distance(2,2) = ${first.distance(2,2)}")

    var point = Point()
    println("Distance() = ${point.distance()}")

}

class Point() {
    var x: Int = 0
    var y: Int = 0

    constructor(x: Int, y: Int) : this() {
        this.x = x
        this.y = y
    }

    fun distance(): Double {
        return sqrt(
            ((0.0 - this.x) * (0.0 - this.x) + (0.0 - this.y) * (0.0 - this.y))
        )
    }

    fun distance(x: Int, y: Int): Double {
        return sqrt(
            (((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)).toDouble())
        )
    }

    fun distance(point: Point): Double {
        return distance(point.x, point.y)
    }
}