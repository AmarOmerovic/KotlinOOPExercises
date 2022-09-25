package com.amaromerovic.kotlinoopexercises

fun main() {

    var wallOne = OneWall("West")
    var wallTwo = OneWall("East")
    var wallThree = OneWall("North")
    var wallFour = OneWall("South")

    var ceiling = Ceiling(12, 55)

    var bed = Bed("Modern", 4, 3, 2, 1)

    var lamp = Lamp("Classic", false, 75)

    var bedroom =
        Bedroom("Amar Omerovic", wallOne, wallTwo, wallThree, wallFour, ceiling, bed, lamp)

    bedroom.makeBed()
    bedroom.lamp.turnOn()


}

class Lamp(style: String, battery: Boolean, globRating: Int) {
    var style: String
        private set
    var battery: Boolean
        private set
    var globRating: Int
        private set

    init {
        this.style = style
        this.battery = battery
        this.globRating = globRating
    }

    fun turnOn() {
        println("Lamp -> The lamp is being turned on")
    }
}

class Bed(style: String, pillow: Int, height: Int, sheets: Int, quilt: Int) {
    var style: String
        private set
    var pillow: Int
        private set
    var height: Int
        private set
    var sheets: Int
        private set
    var quilt: Int
        private set

    init {
        this.style = style
        this.pillow = pillow
        this.height = height
        this.sheets = sheets
        this.quilt = quilt
    }

    fun make() {
        println("Bed -> The bed has been made")
    }

}

class Ceiling(height: Int, paintedColor: Int) {
    var height: Int
        private set
    var paintedColor: Int
        private set


    init {
        this.height = height
        this.paintedColor = paintedColor
    }
}

class OneWall(direction: String) {
    var direction: String
        private set

    init {
        this.direction = direction
    }
}

class Bedroom(
    name: String,
    wallOne: OneWall,
    wallTwo: OneWall,
    wallThree: OneWall,
    wallFour: OneWall,
    ceiling: Ceiling,
    bed: Bed,
    lamp: Lamp
) {
    var name: String
        private set
    var wallOne: OneWall
        private set
    var wallTwo: OneWall
        private set
    var wallThree: OneWall
        private set
    var wallFour: OneWall
        private set
    var ceiling: Ceiling
        private set
    var bed: Bed
        private set
    var lamp: Lamp
        private set

    init {
        this.name = name
        this.wallOne = wallOne
        this.wallTwo = wallTwo
        this.wallThree = wallThree
        this.wallFour = wallFour
        this.ceiling = ceiling
        this.bed = bed
        this.lamp = lamp
    }

    fun makeBed() {
        println("Bedroom -> The bed has been made")
        bed.make()
    }
}