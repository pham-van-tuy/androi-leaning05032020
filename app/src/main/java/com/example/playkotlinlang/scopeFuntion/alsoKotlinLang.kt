package com.example.playkotlinlang.scopeFuntion

class alsoKotlinLang {
    data class Person(var Name: String, var Edge: Int, var About: String) {
        constructor() : this("", 0, "")
    }

    fun writeCreationLog(p: Person) {
        println("A new person ${p.Name} was created.")
    }

    fun alsoKotlinLangTest() {
        val jake = Person("jake", 10, "Android deverlop").also {
            writeCreationLog(it)
        }
    }

}