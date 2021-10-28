package com.example.playkotlinlang.ProductivityBossters

import kotlin.math.min


class DestructuringDeclarations {
    data class User(val useName: String, val Email: String)

    fun getUser() = User("pham van tuy", "phamvantuy93@gmail.com")
    var map = mapOf("Alice" to 25, "Bob" to 15, "Jack" to 20, "Dog" to 30)
    fun findMinMax(list: List<Int>): Pair<Int, Int> {
        var maxList: Int = list.maxOf { it }
        var minList: Int = list.minOf { it }
        return Pair(maxList, minList)
    }

    fun DestructuringDeclarationsTest() {
        val (x, y, z) = arrayOf(5, 10, 15)
        for ((Name, Edge) in map) {
            println("$Name is $Edge  old")
        }
        val (min, max) = findMinMax(listOf(1, 2, 3, 4, 5, 6))
        println(min)
        println(max)

        var user = getUser()
        val (useName, Email) = user
        println(useName == user.component1())
        println(useName == user.component2())
        println(user.component1())
        println(user.component2())
    }
}