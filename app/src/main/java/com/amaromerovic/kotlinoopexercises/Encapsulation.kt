package com.amaromerovic.kotlinoopexercises

fun main() {
    var printer = Printer(50, true)
    println(printer.addToner(50))
    println("inital pages count = " + printer.pagesPrinted)
    var pagesPrinted = printer.printPages(4)
    println("Pages printed was $pagesPrinted new total print count for printer = ${printer.pagesPrinted}");
    pagesPrinted = printer.printPages(2)
    println("Pages printed was $pagesPrinted new total print count for printer = ${printer.pagesPrinted}");


}

class Printer(tonerLevel: Int, duplex: Boolean) {
    var tonerLevel: Int
        private set
    var pagesPrinted = 0
        private set
    var duplex: Boolean
        private set

    init {
        this.tonerLevel = if (tonerLevel >= 0 || tonerLevel <= 100) tonerLevel else -1
        this.duplex = duplex
    }

    fun addToner(toneAmount: Int): Int {
        if (toneAmount in 1..100) {
            if (tonerLevel + toneAmount > 100) {
                return -1
            } else {
                tonerLevel += toneAmount
                return tonerLevel
            }
        }
        return -1
    }

    fun printPages(pages: Int): Int {
        var pagesToPrint = 0
        pagesToPrint = if (duplex) {
            println("Printing in duplex mode")
            (pages / 2) + (pages % 2)
        } else {
            println("Printing in half duplex mode")
            pages
        }
        pagesPrinted += pagesToPrint
        return pagesToPrint
    }
}