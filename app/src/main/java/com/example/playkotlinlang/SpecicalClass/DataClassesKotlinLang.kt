package com.example.playkotlinlang.SpecicalClass

class DataClassesKotlinLang {
    data class User(val Name: String, val Id: Int) {
        override fun equals(other: Any?) =
            other is User && other.Id == this.Id

    }

    fun dataClassesTest() {
        val user = User("Naruto", 9)
        println(user)
        val firtUse = User("Naruto", 9)
        val seconUse = User("Hitachi", 8)
        println("firt user = User : ${user == firtUse} ")
        println("secon = User : ${user == seconUse} ")
        println("firt user != User : ${user === firtUse} ")
        println(user.hashCode())
        println(seconUse.hashCode())
        println(user.copy("pham van tuy"))
        println(user)
    }
}