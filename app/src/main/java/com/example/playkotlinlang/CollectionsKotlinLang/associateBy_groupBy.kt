package com.example.playkotlinlang.CollectionsKotlinLang

class associateBy_groupBy {
    data class Persion(val Name: String, val City: String, val Phone: String)

    val People = listOf(
        Persion("Jerry", "Ha Noi", "0376370897"),
        Persion("Tom", "Vinh", "01676370897"),
        Persion("And", "Nghe An", "0987654321")
    )

    fun associateBy_groupByTest() {
        val PhoneBook = People.associateBy { it.Phone }
        val NameBook = People.associateBy { it.Name }
        val CityBook = People.associateBy { it.City }
        val PhoneName = People.groupBy(Persion::Name, Persion::Phone)
        val PhoneCity = People.associateBy(Persion::Phone, Persion::City)

        println(PhoneBook)
        println(NameBook)
        println(CityBook)
        println(PhoneName)
        println(PhoneCity)

    }
}