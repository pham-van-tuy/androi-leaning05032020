package com.example.playkotlinlang.CollectionsKotlinLang

class getOrElse {
    val listNumber = listOf<Int>(1, 2, 4, 5, 6, 2, 5, 7, 4, 7, 9, 0, 3)
    val listMap = mutableMapOf<String, Int?>()
    fun getOrElseTest() {
        val numberGetOrElse = listNumber.getOrElse(1,
            { 4 }) // in phan tu so (index  :1) if out size will print else : 4
        println(numberGetOrElse)                                    // lay pha tu so  n cua chuoi
        println(listNumber.getOrElse(5, { 6 }))
        println(listNumber.getOrElse(5, { 4 }))
        println(listMap.getOrElse("x") { 1 })       // 1
        listMap["x"] = 3
        println(listMap.getOrElse("x") { 1 })       // 2
        listMap["x"] = null
        println(listMap.getOrElse("x") { 1 })       // 3

    }

}