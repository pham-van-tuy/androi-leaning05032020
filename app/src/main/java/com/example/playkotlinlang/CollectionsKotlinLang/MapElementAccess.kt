package com.example.playkotlinlang.CollectionsKotlinLang

class MapElementAccess {
    val map = mapOf("key" to 42)
    val value1 = map["key"]                                     // 1
    val value2 = map["key2"]                                    // 2
    val value3: Int = map.getValue("key")                       // 1
    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")                // 3
    fun MapElementAccessTest() {
        println("value1 is $value1")
        println("value2 is $value2")
        println("value3 is $value3")
        println("value4 is $value4")
    }
}



