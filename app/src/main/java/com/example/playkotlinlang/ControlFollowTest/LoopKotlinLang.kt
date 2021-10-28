package com.example.playkotlinlang.ControlFollowTest

class LoopKotlinLang {
    var StudentScore = 0
    var StudentId = 0
    var listStudent = listOf<String>("NAME", "SCORE", "ID", "OLD")
    fun StudentSpeak() {
        println("println student speak")
    }

    fun StudentSong() {
        println("println student Song")
    }

    fun StudentDoWhile() {
        do {
            println(StudentId)
            StudentSpeak()
            StudentScore++
            StudentId++

        } while (StudentScore < 10)
    }

    fun StudentFor() {
        var i = 0
        for (list in listStudent) {
            i++
            if (list == "NAME") {
                println("LIST == Name")
            }
            if (list == "ID") {
                break
            }
        }
    }

    fun LoopKotlinTest() {
        StudentDoWhile()
        StudentFor()
    }
}