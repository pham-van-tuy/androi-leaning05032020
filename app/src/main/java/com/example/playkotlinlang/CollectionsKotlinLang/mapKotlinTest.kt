package com.example.playkotlinlang.CollectionsKotlinLang

class mapKotlinTest {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }
    fun mapKotlinTest() {
        println(doubled)
        println(tripled)
    }
}