package com.example.playkotlinlang.scopeFuntion

class runKotlinLang {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            length
        }
    }

    fun runKotlinLangTest() {
        getNullableLength("pham van tuy")
        getNullableLength(null)
        getNullableLength("")
    }
}