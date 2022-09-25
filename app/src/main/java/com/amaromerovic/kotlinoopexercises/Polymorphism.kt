package com.amaromerovic.kotlinoopexercises

fun main() {
    val car = MuscleCar(8, "Base car")
    println(car.startEngine())
    println(car.accelerate())
    println(car.brake())

    val mitsubishi = Mitsubishi(6, "Outlander VRX 4WD")
    println(mitsubishi.startEngine())
    println(mitsubishi.accelerate())
    println(mitsubishi.brake())

    val holden = Holden(6, "Holden Commodore")
    println(holden.startEngine())
    println(holden.accelerate())
    println(holden.brake())

    val ford = Ford(6, "Ford Falcon")
    println(ford.startEngine())
    println(ford.accelerate())
    println(ford.brake())
}

open class MuscleCar(cylinder: Int, name: String) {
    var engine: Boolean = true
        private set
    var cylinder: Int
        private set
    var name: String
        private set
    var wheel: Int = 4
        private set

    init {
        this.cylinder = cylinder
        this.name = name
    }

    open fun startEngine(): String {
        return "MuscleCar -> The car's engine is starting."
    }

    open fun accelerate(): String {
        return "MuscleCar -> The car is accelerating."
    }

    open fun brake(): String {
        return "MuscleCar -> The car is braking."
    }

}

class Mitsubishi(cylinder: Int, name: String) : MuscleCar(cylinder, name) {
    override fun startEngine(): String {
        return "Mitsubishi -> ${super.startEngine()}"
    }

    override fun accelerate(): String {
        return "Mitsubishi -> ${super.accelerate()}"
    }

    override fun brake(): String {
        return "Mitsubishi -> ${super.brake()}"

    }
}

class Holden(cylinder: Int, name: String) : MuscleCar(cylinder, name) {
    override fun startEngine(): String {
        return "Holden -> ${super.startEngine()}"
    }

    override fun accelerate(): String {
        return "Holden -> ${super.accelerate()}"
    }

    override fun brake(): String {
        return "Holden -> ${super.brake()}"
    }
}


class Ford(cylinder: Int, name: String) : MuscleCar(cylinder, name) {
    override fun startEngine(): String {
        return "Ford -> ${super.startEngine()}"
    }

    override fun accelerate(): String {
        return "Ford -> ${super.accelerate()}"
    }

    override fun brake(): String {
        return "Ford -> ${super.brake()}"
    }
}