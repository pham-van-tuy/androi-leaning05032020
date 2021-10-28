package com.example.playkotlinlang.CollectionsKotlinLang

class Find_FindLast {
    val listString = listOf<String>("11", "22", "23", "14", "55")
    fun Finf_FindLastTest() {
        val firtListString = listString.find { it.startsWith("1") }
        val lastListString = listString.last { it.startsWith("1") }
        val nothingListString = listString.contains("nothing")
        println(firtListString)
        println(lastListString)
        println(nothingListString)

    }
}