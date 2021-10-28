package com.example.playkotlinlang.FuntionalKotlinLang

class HightOrderFuntion {
    fun Caculate(X: Int, Y: Int, operation: (Int, Int) -> Int): Int {
        return operation(X, Y)
    }

    fun Sum(X: Int, Y: Int) = X + Y
    fun HightOrderFuntionTest() {
        val sumResult = Caculate(4, 5, ::Sum)
        val mulResult = Caculate(4, 5, { a, b -> a * b })
        println(sumResult)
        println(mulResult)

        val func = operation()                                          // 3
        println(func(2))
    }

    fun operation(): (Int) -> Int {
        return ::square
    }

    fun square(x: Int) = x * x
}