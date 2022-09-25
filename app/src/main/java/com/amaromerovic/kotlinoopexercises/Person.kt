package com.amaromerovic.kotlinoopexercises

fun main () {
    val person = Person("Amar", "Omerovic", 1)
    person.firstName = ""
    person.lastName = ""
    person.age = 10
    println("Full name = " + person.getFullName())
    println("Teen = " + person.isTeen())
    person.firstName = "John"
    person.age = 18
    println("Full name = " + person.getFullName())
    println("Teen = " + person.isTeen())
    person.lastName = "Smith"
    println("Full name = " + person.getFullName())
}

class Person(firstName: String, lastName: String, age: Int) {
    var firstName: String
    var lastName: String
    var age: Int

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    fun isTeen(): Boolean {
        return age in 13 until 20
    }

    fun getFullName(): String {
        if (firstName.isEmpty() && lastName.isEmpty()){
            return ""
        } else if (firstName.isEmpty()) {
            return lastName
        } else if (lastName.isEmpty()) {
            return firstName
        } else {
            return "$firstName $lastName"
        }

    }
}