package com.example.playkotlinlang.FuntionalKotlinLang

class LamdaFuntion {
    val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }
    val upperCase2: (String) -> String = { s: String -> s.removePrefix("stx") }
    val upperCase3 = { str: String -> str.toUpperCase() }                     // 3
    val upperCase5: (String) -> String = { it.toUpperCase() }                 // 5
    val upperCase6: (String) -> String = String::toUpperCase                  // 6

    fun LamdaFuntionTest() {
        println(upperCase1("pham van tuy"))
        println(upperCase2("stx pham van tuy"))
        println(upperCase3("pham van tuy"))
        println(upperCase5("pham van tuy"))
        println(upperCase6("pham van tuy"))

    }
}
