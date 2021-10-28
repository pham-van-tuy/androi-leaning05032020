package com.example.playkotlinlang.CollectionsKotlinLang

import kotlin.math.abs

class SortedKotlinLang {
    val numberShuffledList = listOf<Int>(-3, 6, -6, 4, -7, 1, 2, 3, 4, 5)  ///list xao tron
    fun SortedKotlinLangTest() {
        val natural =
            numberShuffledList.sorted()                             // natural :list tu nhien
        val inverted =
            numberShuffledList.sortedBy { -it }                    // inverted : dao nguoc
        val descending =
            numberShuffledList.sortedDescending()                // descending : giam dan
        val descendingBy = numberShuffledList.sortedByDescending { abs(it) } //
        println(natural)
        println(inverted)
        println(descending)
        println(descendingBy)

    }
}