package com.example.playkotlinlang.CollectionsKotlinLang

import android.text.method.MultiTapKeyListener

class ListKotlinLang {
    val systemUser: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 5, 6)
    val sudoers: List<Int> = systemUser
    fun addSystemUser(newUser: Int) {
        systemUser.add(newUser)
    }
    fun getSystemUse(): List<Int> {
        return sudoers
    }
    fun listKotlinLangTet() {
        addSystemUser(0)
        println(systemUser)
        addSystemUser(1)
        println(systemUser)
        getSystemUse().forEach { i ->
            println("Some useful info on user $i")

        }
    }
}