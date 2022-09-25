package com.amaromerovic.kotlinoopexercises

import kotlin.properties.Delegates

fun main() {
    var rectangle = Rectangle(5.0, 10.0)
    println("rectangle.width = ${rectangle.width}")
    println("rectangle.length = ${rectangle.length}")
    println("rectangle.area = ${rectangle.getArea()}")

    var cuboid = Cuboid(5.0, 10.0, 5.0);
    println("cuboid.width = ${cuboid.width}")
    println("cuboid.length = ${cuboid.length}")
    println("cuboid.area = ${cuboid.getArea()}")
    println("cuboid.height = ${cuboid.height}")
    println("cuboid.volume = ${cuboid.getVolume()}")

}

open class Rectangle(width: Double, length: Double) {
    var width by Delegates.notNull<Double>()
    var length by Delegates.notNull<Double>()

    init {
        this.width = if (width < 0) 0.0 else width
        this.length = if (length < 0) 0.0 else length
    }

    fun getArea(): Double {
        return width * length
    }
}

class Cuboid(width: Double, length: Double, height: Double) : Rectangle(width, length) {
    var height by Delegates.notNull<Double>()

    init {
        this.height = if (height < 0) 0.0 else height
    }

    fun getVolume(): Double {
        return getArea() * height
    }
}