package com.amaromerovic.kotlinoopexercises

import kotlin.properties.Delegates

fun main() {
    var carpet = Carpet(3.5)
    var floor = Floor(2.75, 4.0)
    var calculator = Calculator(floor, carpet)
    println("Total = ${calculator.getTotalCost()}")

    carpet = Carpet(1.5)
    floor = Floor(5.4, 4.5)
    calculator = Calculator(floor, carpet)
    println("Total = ${calculator.getTotalCost()}")

}

class Floor(width: Double, length: Double) {
    var width by Delegates.notNull<Double>()
    var length by Delegates.notNull<Double>()

    init {
        this.width = if (width < 0) 0.0 else width
        this.length = if (length < 0) 0.0 else length

    }

    fun getArea(): Double{
        return width.times(length)
    }
}


class Carpet(cost: Double){
    var cost by Delegates.notNull<Double>()

    init {
        this.cost = if (cost < 0) 0.0 else cost
    }
}

class Calculator(floor: Floor, carpet: Carpet) {
    var floor by Delegates.notNull<Floor>()
    var carpet by Delegates.notNull<Carpet>()

    init {
        this.floor = floor
        this.carpet = carpet
    }

    fun getTotalCost(): Double {
        return floor.getArea().times(carpet.cost)
    }
}
