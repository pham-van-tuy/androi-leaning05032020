package com.example.playkotlinlang.ControlFollowTest

class WhenKotlinLang {
    fun WhenKotlinTestPlay() {
        Student("android")
        Student("ios")
        Student("math")
        Student(1L)
        Student(10)
        StudentPoint(1)
        StudentPoint(3)
        StudentPoint(2)
        StudentPoint(4)
    }

    fun Student(obj: Any) {
        when (obj) {
            "android" -> println("obj = android student")
            "ios" -> println("obj = ios student")
            "math" -> println("obj = math student")
            1L -> println("obj = 1L student")
            10 -> println("obj = 10 student")
        }

    }

    fun StudentPoint(pointObj: Any): Any {
        val result = when (pointObj) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "fore"
            else -> "missmath"
        }
        return result
    }
}