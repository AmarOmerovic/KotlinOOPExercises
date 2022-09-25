package com.amaromerovic.kotlinoopexercises

fun main() {
    val simpleCalculator = SimpleCalculator(1.0, 2.0)
    simpleCalculator.firstNumber = 5.0
    simpleCalculator.secondNumber = 4.0
    println("Add = ${simpleCalculator.getAdditionResult()}")
    println("Subtract = ${simpleCalculator.getSubtractionResult()}")
    simpleCalculator.firstNumber = 5.25
    simpleCalculator.secondNumber = 0.0
    println("Multiply = ${simpleCalculator.getMultiplicationResult()}")
    println("Divide = ${simpleCalculator.getDivisionResult()}")
}


class SimpleCalculator(firstNumber: Double, secondNumber: Double) {
    var firstNumber: Double
    var secondNumber: Double

    init {
        this.firstNumber = firstNumber
        this.secondNumber = secondNumber

    }

    fun getAdditionResult(): Double {
        return firstNumber + secondNumber
    }

    fun getSubtractionResult(): Double {
        return firstNumber - secondNumber
    }

    fun getMultiplicationResult(): Double {
        return firstNumber * secondNumber
    }

    fun getDivisionResult(): Double {
        return if (secondNumber != 0.0) firstNumber / secondNumber else 0.0
    }
}

