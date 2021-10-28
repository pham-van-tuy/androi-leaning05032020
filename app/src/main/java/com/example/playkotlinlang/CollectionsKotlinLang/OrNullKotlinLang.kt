package com.example.playkotlinlang.CollectionsKotlinLang

class OrNullKotlinLang {
    val listNumber = listOf<Int>(1, 2, 3, 4)
    val listEmpty = emptyList<Int>()
    val listNumberOnly = listOf<Int>(6)
    fun OrNullKotlinLangTest() {
        val maxListNumber = listNumber.maxOrNull()
        val minlistNumber = listNumber.minOrNull()
        val maxListEmpty = listEmpty.maxOrNull()
        val minlistEmpty = listEmpty.minOrNull()
        val maxListNumberOnly = listNumberOnly.maxOrNull()
        val minlistNumberOnly = listNumberOnly.minOrNull()

        println(maxListNumber)
        println(minlistNumber)
        println(maxListEmpty)
        println(minlistEmpty)
        println(maxListNumberOnly)
        println(minlistNumberOnly)
    }
}