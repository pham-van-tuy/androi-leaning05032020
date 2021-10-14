package com.example.playkotlinlang.ControlFollowTest

class ConditionalExpression {
    fun ConditionalExpressionTestPlay () {
        println(max(10,6))
        println(min(10,6))

    }
    fun max (x :Int,y:Int) = if (x>y)x else y
    fun min (x :Int,y:Int) = if (x<y)x else y

}