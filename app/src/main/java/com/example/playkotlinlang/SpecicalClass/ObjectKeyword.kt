package com.example.playkotlinlang.SpecicalClass
import java.util.*

class ObjectKeyword {
    fun getNumberRandom() {
        var numberRandom = Random()
        println(numberRandom.nextInt(50))
    }
    fun objectKeywordTest() {
        val number1 = ObjectKeyword()
        number1.getNumberRandom()
        val number2 = ObjectKeyword()
        number2.getNumberRandom()
    }
}
