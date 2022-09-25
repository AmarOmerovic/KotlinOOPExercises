package com.amaromerovic.kotlinoopexercises

import kotlin.properties.Delegates

fun main() {
    var bmw = BMW()

    bmw.thisIs()
//    bmw.model = "X6 M"
    bmw.turnOn()
    bmw.increaseSpeed()
    bmw.decreaseSpeed()
    bmw.breaking()
    bmw.turnOf()



}

open class Vehicle(engineCapacity: Double, steeringType: String, noBatterys: Int) {
    var engineCapacity by Delegates.notNull<Double>()
    var steeringType by Delegates.notNull<String>()
    var noBatterys by Delegates.notNull<Int>()

    init {
        this.engineCapacity = engineCapacity
        this.steeringType = steeringType
        this.noBatterys = noBatterys
    }


    open fun turnOn() {
        println("Turning on...")
    }

    open fun turnOf() {
        println("Turning off...")
    }

    open fun increaseSpeed() {
        println("Increasing speed...")
    }

    open fun decreaseSpeed() {
        println("Decreasing speed...")
    }
}


open class Car(
    noDoors: Int, suspension: String, isAutomatic: Boolean, gears: Int, model: String, type: String, year: Int, color: String,
    engineCapacity: Double, steeringType: String, noBatterys: Int
) : Vehicle(engineCapacity, steeringType, noBatterys) {
    var noDoors by Delegates.notNull<Int>()
    var year by Delegates.notNull<Int>()
    var suspension by Delegates.notNull<String>()
    var isAutomatic by Delegates.notNull<Boolean>()
    var gears by Delegates.notNull<Int>()
    var model by Delegates.notNull<String>()
    var type by Delegates.notNull<String>()
    var color by Delegates.notNull<String>()


    init {
        this.noDoors = noDoors
        this.year = year
        this.suspension = suspension
        this.isAutomatic = isAutomatic
        this.gears = gears
        this.model = model
        this.type = type
        this.color = color
    }


    fun thisIs() {
        println("This is a $model $year $type with an $gears speed " + if (isAutomatic) "automatic gearbox in $color." else "manual gearbox in $color.")
    }

}

class BMW() : Car(2, "Air suspension", true, 8, "M8 CS", "Coupe", 2022, "Black", 5.0, "Sport Wheel", 3) {

    override fun turnOn() {
        println("$model turning on...")
    }

    override fun increaseSpeed() {
        println(if (isAutomatic) "Automatic gear box shifted int a low gear, we are going full speed" else "Manual gearbox shifted int a low gear, we are going full speed")
    }

    fun breaking() {
        println("Driver hits the break and the car stops")
    }
}

