package com.example.playkotlinlang.CollectionsKotlinLang

class Firt_FirtLast {
    val listNumber = listOf<Int>(1, 3, 4, 5, 633, 2, 344, 556)
    fun Firt_FirtLastTest() {
        val numberFirt = listNumber.first()
        val numberLast = listNumber.last()
        val numberFirtEvent = listNumber.first { it % 2 == 0 }
        val numberLastEvent = listNumber.last { it % 2 == 0 }
        println(numberFirt)
        println(numberFirtEvent)
        println(numberLast)
        println(numberLastEvent)
        println(listNumber)

    }
}