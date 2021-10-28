package com.example.playkotlinlang.FuntionalKotlinLang

class ExtensionFunc {
    data class Item(val name: String, val price: Float)
    data class Order(val items: Collection<Item>)

    fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
}