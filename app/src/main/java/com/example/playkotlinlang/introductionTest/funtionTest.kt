package com.example.playkotlinlang.introductionTest

class funtionTest {
    fun printMesenger (mesengerTest :String){
        println(mesengerTest)
    }
    fun printMesengerWithpreFix (mesengerTest :String , prefixTset : String = "infore") {
        println("[$prefixTset] $mesengerTest")
    }
    fun sumTest (x :Int, y:Int):Int{
        return x + y
    }
    fun multylyTest (x:Int , y:Int):Int {
        return x * y
    }
    fun funtionTestPlay () {
        println("helo funtionTestplay is running")
        printMesenger("funtion printmesenger is running")
        printMesengerWithpreFix("mesengertest", "prefix status")
        printMesengerWithpreFix("mesengertest")
        printMesengerWithpreFix(prefixTset = "pham van tuy",mesengerTest = "mesengertest")
        println(sumTest(4,6))
        println(multylyTest(4,6))
    }
}