package com.example.playkotlinlang.scopeFuntion

class applyKotlinLang {
    data class Persion(var Name: String, var age: Int, var about: String) {
        constructor() : this("", 0, "")
    }

    fun applyKotlinLangTest() {
        val jakes = Persion()
        val stringDescription = jakes.apply {                    // 2
            Name = "Jake"                                       // 3
            age = 30
            about = "Android developer"
        }.toString()
        println(stringDescription)
    }
}