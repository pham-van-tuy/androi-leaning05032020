package com.example.playkotlinlang.CollectionsKotlinLang

class zipKotlinLang {
    val A = listOf("a", "b", "c")                  // 1
    val B = listOf(1, 2, 3, 4)                     // 1

    val resultPairs = A zip B                      // 2
    val resultReduce = A.zip(B) { a, b -> "$a$b" } // 3
    fun zipKotlinLangTest() {
        println(B zip A)
        println(resultPairs zip resultReduce)
        println(resultPairs)
        println(resultReduce)
    }
}