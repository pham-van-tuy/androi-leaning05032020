package com.example.playkotlinlang.ProductivityBossters

class NameArguments {
    fun format(userName: String, domane: String) = "$userName@$domane"
    fun NamedArgumentsTest() {
        println(format("phamvantuy", "gmail.com"))
        println(format("phamvantuy", "google.com"))
        println(format("phamvantuy", "kakaotak.com"))

        println(format(userName = "phamvantuy", domane = "gmail.com"))

    }
}