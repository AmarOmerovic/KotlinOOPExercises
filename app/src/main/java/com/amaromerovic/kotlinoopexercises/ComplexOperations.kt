package com.amaromerovic.kotlinoopexercises

import kotlin.properties.Delegates

fun main() {
    var one = ComplexNumber(1.0, 1.0)
    var number = ComplexNumber(2.5, -1.5)

    one.add(1.0,1.0)

    println("one.real = ${one.real}")
    println("one.imaginary = ${one.imaginary}")

    one.subtract(number)

    println("one.real = ${one.real}")
    println("one.imaginary = ${one.imaginary}")

    number.subtract(one)

    println("number.real = ${number.real}")
    println("number.imaginary = ${number.imaginary}")




}

class ComplexNumber(real: Double, imaginary: Double) {
    var real by Delegates.notNull<Double>()
    var imaginary by Delegates.notNull<Double>()

    init {
        this.real = real
        this.imaginary = imaginary
    }

    fun add(real: Double, imaginary: Double) {
        this.real += real
        this.imaginary += imaginary
    }

    fun add(complexNumber: ComplexNumber) {
        this.real += complexNumber.real
        this.imaginary += complexNumber.imaginary
    }

    fun subtract(real: Double, imaginary: Double) {
        this.real -= real
        this.imaginary -= imaginary
    }

    fun subtract(complexNumber: ComplexNumber) {
        this.real -= complexNumber.real
        this.imaginary -= complexNumber.imaginary
    }
}