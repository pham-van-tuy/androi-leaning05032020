package com.example.playkotlinlang.CollectionsKotlinLang

class Any_All_None {
    val number = listOf<Int>(1, 2, 3, -6, -3, -3, -1)
    fun AnyKotlinLang() {
        val numberAny1 = number.any { it < 0 }
        val numberAny2 = number.any { it > 6 }
        println(numberAny1)
        println(numberAny2)
    }

    fun AllKotlinLang() {
        val numberall1 = number.all { it % 2 == 0 }
        val numberall2 = number.all { it > -8 }
        val numberall3 = number.all { it < 0 }
        println(numberall1)
        println(numberall2)
        println(numberall3)
    }

    fun NoneKotlinLang() {
        val numberNone1 = number.none { it % 2 == 0 }
        val numberNone2 = number.none { it > -8 }
        val numberNone3 = number.none { it < 0 }
        println(numberNone1)
        println(numberNone2)
        println(numberNone3)
    }

    fun Any_All_None_Test() {
        AnyKotlinLang()
        AllKotlinLang()
        NoneKotlinLang()
    }


}