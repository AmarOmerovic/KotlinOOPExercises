package com.amaromerovic.kotlinoopexercises

fun main() {
    val hamburger = Hamburger("Basic", "Sausage", 3.56, "White")
    hamburger.addHamburgerAddition(1, "Tomato", 0.27)
    hamburger.addHamburgerAddition(2, "Lettuce", 0.75)
    hamburger.addHamburgerAddition(3, "Cheese", 1.13)
    println("Total Burger price is " + hamburger.itemizeHamburger())

    println("\n****************************************************************************************")

    val healthyBurger = HealthyBurger("Bacon", 5.67)
    healthyBurger.addHealthyAddition(1, "Egg", 5.43)
    healthyBurger.addHealthyAddition(2, "Lentils", 3.41)
    println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger())

    println("\n****************************************************************************************")

    val deluxeBurger = DeluxeBurger()
    deluxeBurger.addHamburgerAddition(1, "Should not do this", 50.53)
    println("Total Deluxe Burger price is " + deluxeBurger.itemizeHamburger())
}

open class Hamburger(name: String, meat: String, price: Double, breadRollType: String) {
    private var name: String
    private var meat: String
    var price: Double
    private var breadRollType: String

    private var additionNameList: ArrayList<String> = ArrayList()
    private var additionPriceList: ArrayList<Double> = ArrayList()

    init {
        this.name = name
        this.price = price
        this.meat = meat
        this.breadRollType = breadRollType
        println("$name hamburger on a $breadRollType with $meat is $price")

    }

    open fun addHamburgerAddition(noAddition: Int, additionType: String, additionPrice: Double) {
        if (noAddition < 1 || noAddition > 4) {
            println("You can get up to 4 additions!")
        } else {
            println("$additionType added for $additionPrice!")
            additionNameList.add(additionType)
            additionPriceList.add(additionPrice)
        }
    }


    open fun itemizeHamburger(): Double {
        var totalPrice = 0.0
        if (additionNameList.isNotEmpty()) {
            for (i in 0 until additionNameList.size) {
                totalPrice += additionPriceList[i]
            }
        }
        totalPrice += price
        return totalPrice
    }
}

class DeluxeBurger :
    Hamburger("Deluxe", "Bacon & Cheese", 14.54, "White roll") {

    init {
        super.addHamburgerAddition(1,"Chips", 2.75)
        super.addHamburgerAddition(2,"Drink", 1.81)
    }

    override fun addHamburgerAddition(
        noAddition: Int,
        additionType: String,
        additionPrice: Double
    ) {
        println("No additional items can be added to a deluxe burger.")
    }

}

class HealthyBurger(meat: String, price: Double) :
    Hamburger("Health", meat, price, "Brown rye roll") {
    private var healthyExtraName: ArrayList<String> = ArrayList()
    private var healthyExtraPrice: ArrayList<Double> = ArrayList()

    fun addHealthyAddition(noAddition: Int, additionType: String, additionPrice: Double) {
        if (noAddition < 0 || noAddition > 2) {
            println("You can get up to 2 additions!")
        } else {
            println("$additionType added for $additionPrice!")
            healthyExtraName.add(additionType)
            healthyExtraPrice.add(additionPrice)
        }
    }

    override fun itemizeHamburger(): Double {
        var totalPrice = 0.0
        if (healthyExtraName.isNotEmpty()) {
            for (i in 0 until healthyExtraName.size) {
                totalPrice += healthyExtraPrice[i]
            }
        }
        totalPrice += price
        return totalPrice
    }
}

