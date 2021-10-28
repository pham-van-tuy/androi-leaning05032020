package com.example.playkotlinlang.CollectionsKotlinLang

class CountKotlinLang {
    val listNumber = listOf<Int>(1, 2, 3, 4, 5, 5, 3, 3)
    val listString = listOf<String>("toi", "ten", "tuy")
    fun CountKotlinLangTest() {
        val totalNumber = listNumber.count()
        val eventCount = listNumber.count { it % 2 == 0 }
        val totalString = listString.count()
        println(totalNumber)
        println(totalString)
        println(eventCount)
    }
}