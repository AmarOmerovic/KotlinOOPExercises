package com.amaromerovic.kotlinoopexercises

fun main() {

}

interface ISaveable {
    fun write(): List<String>
    fun read(content: List<String>)
}

class Player(name: String, hitPoints: Int, strength: Int) : ISaveable {
    var name: String
    var hitPoints: Int
    var strength: Int
    var weapon: String

    init {
        this.name = name
        this.hitPoints = hitPoints
        this.strength = strength
        this.weapon = "Sword"
    }

    override fun write(): List<String> {
        val contentList = ArrayList<String>()
        contentList.add(0, name)
        contentList.add(1, hitPoints.toString())
        contentList.add(2, strength.toString())
        contentList.add(3, weapon)
        return contentList
    }

    override fun read(content: List<String>) {
        if (content.isNotEmpty()) {
            this.name = content[0]
            this.hitPoints = content[1].toInt()
            this.strength = content[2].toInt()
            this.weapon = content[3]
        }
    }

    override fun toString(): String {
        return "Player(name='$name', hitPoints=$hitPoints, strength=$strength, weapon='$weapon')"
    }

}

class Monster(name: String, hitPoints: Int, strength: Int) : ISaveable {
    var name: String
        private set
    var hitPoints: Int
        private set
    var strength: Int
        private set

    init {
        this.name = name
        this.hitPoints = hitPoints
        this.strength = strength
    }

    override fun write(): List<String> {
        val contentList = ArrayList<String>()
        contentList.add(0, name)
        contentList.add(1, hitPoints.toString())
        contentList.add(2, strength.toString())
        return contentList
    }

    override fun read(content: List<String>) {
        if (content.isNotEmpty()) {
            this.name = content[0]
            this.hitPoints = content[1].toInt()
            this.strength = content[2].toInt()
        }
    }

    override fun toString(): String {
        return "Monster(name='$name', hitPoints=$hitPoints, strength=$strength)"
    }
}