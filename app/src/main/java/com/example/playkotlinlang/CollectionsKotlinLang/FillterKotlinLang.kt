package com.example.playkotlinlang.CollectionsKotlinLang

class FillterKotlinLang {
    val listDataNumber = listOf<Int>(2, 4, 5, 6, 7, -6, -7, -5)
    val positiveNumber = listDataNumber.filter { x -> x >= 0 }
    val negativeNumber = listDataNumber.filter { x -> x < 0 }
    fun FillterKotlinLangTest() {
        println(positiveNumber)
        println(negativeNumber)
    }

}
