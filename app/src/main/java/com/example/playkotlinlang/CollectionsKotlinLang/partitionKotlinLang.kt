package com.example.playkotlinlang.CollectionsKotlinLang

class partitionKotlinLang {
    val listNumber = listOf<Int>(1, 2, 3, -1, -2, -3, -4, 6)
    fun partitionKotlinLangTest() {
        val eventOdd = listNumber.partition { it % 2 == 0 }
        val (Positive, Nagative) = listNumber.partition { it > 0 }
        println(eventOdd)
        println(eventOdd.first)
        println(eventOdd.second)
        println(Positive)
        println(Nagative)

    }
}