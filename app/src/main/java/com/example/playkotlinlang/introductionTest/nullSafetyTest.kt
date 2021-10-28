package com.example.playkotlinlang.introductionTest

class nullSafetyTest {
    fun nullSafetyTestPlay() {
        var neverNull: String = "it cannot Null variable"
        var nullAble: String? = "it can Null variable"
        nullAble = null
        println(neverNull)
        println(nullAble)
        println(stringLengt("pham van tuy"))

    }

    fun stringLengt(NotNull: String): Int {
        return NotNull.length
    }
}