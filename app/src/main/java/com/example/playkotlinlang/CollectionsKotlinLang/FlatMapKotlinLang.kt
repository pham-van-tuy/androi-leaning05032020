package com.example.playkotlinlang.CollectionsKotlinLang

class FlatMapKotlinLang {
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    fun FlatMapKotlinLangTest() {
        val cart = listOf(fruitsBag, clothesBag)
        val mapBag = cart.map { it }
        val flatMapBag = cart.flatMap { it }   // flat : bằng phẳng (gộp chung hai listof )
        println(mapBag)
        println(flatMapBag)
    }
}