package com.example.playkotlinlang.introductionTest

class genericsTest {
    open class People {
        open fun PeopleSay() {
            println("people say hello")
        }
    }

    class manPeople : People() {
        override fun PeopleSay() {
            println("override fun start")
        }
    }

    fun genericsTestPlay() {
        val people: People = manPeople()
        people.PeopleSay()
        println(people)
    }
}