package com.example.playkotlinlang.SpecicalClass

class EnumClassKotlinLang {
    enum class machinsState {
        RUNNING, IDLE, STOP, ALARM
    }

    fun EnumClassTest() {
        val stateMachins = machinsState.RUNNING
        val mesengerState = when (stateMachins) {
            machinsState.RUNNING -> "machins is running"
            machinsState.STOP -> "machins is STOP"
            machinsState.IDLE -> "machins is IDLE"
            machinsState.ALARM -> "machins is ALARM"
        }
        println(mesengerState)
    }
}