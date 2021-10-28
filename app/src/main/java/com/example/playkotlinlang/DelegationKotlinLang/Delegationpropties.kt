package com.example.playkotlinlang.DelegationKotlinLang

import kotlin.reflect.KProperty


class Delegationpropties {
    class Example {
        val p: String by Delegate()
        override fun toString(): String = "Example Class"
    }

    class Delegate() {
        operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2
            return "$thisRef, thank you for delegating '${prop.name}' to me!"
        }
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }

    fun DelegationproptiesTest() {
        var e = Example()
        println(e.p)

    }


}