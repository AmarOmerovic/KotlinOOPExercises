package com.amaromerovic.kotlinoopexercises

import kotlin.math.PI
import kotlin.properties.Delegates

fun main() {
    var circle = Circle(3.75)
    println("circle.radius = ${circle.radius}")
    println("circle.area = ${circle.getArea()}")

    var cylinder = Cylinder(5.55, 7.25)
    println("cylinder.radius = ${cylinder.radius}")
    println("cylinder.height = ${cylinder.height}")
    println("cylinder.area = ${cylinder.getArea()}")
    println("cylinder.volume = ${cylinder.getVolume()}")
}

open class Circle(radius: Double) {
    var radius by Delegates.notNull<Double>()

    init {
        this.radius = if (radius < 0) 0.0 else radius
    }

    fun getArea(): Double {
        return radius * radius * PI
    }
}

class Cylinder(radius: Double, height: Double) : Circle(radius) {
    var height by Delegates.notNull<Double>()

    init {
        this.height = if (height < 0) 0.0 else height
    }

    fun getVolume(): Double {
        return getArea() * height
    }
}