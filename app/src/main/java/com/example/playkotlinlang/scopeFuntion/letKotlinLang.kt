package com.example.playkotlinlang.scopeFuntion

class letKotlinLang {
    fun customPrint(s: String) {
        print(s.toUpperCase())
    }

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")
        str?.let {                         // 4
            customPrint(it)
        }
    }

    fun letKotlinLangTest() {
        val empty = "test".let {
            customPrint(it)
        }
        printNonNull("pham van tuy")
    }
}