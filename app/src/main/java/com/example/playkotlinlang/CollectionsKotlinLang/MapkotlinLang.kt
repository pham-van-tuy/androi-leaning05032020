package com.example.playkotlinlang.CollectionsKotlinLang

class MapkotlinLang {
    val POINT_X_PASS: Int = 1
    val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
    val EZPassReport: Map<Int, Int> = EZPassAccounts
    fun updatePointsCredit(accountId: Int) {
        if (EZPassAccounts.containsKey(accountId)) {                                        // 3
            println("Updating $accountId...")
            EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINT_X_PASS  // 4
        } else {
            println("Error: Trying to update a non-existing account (id: $accountId)")
        }
    }

    fun MapkotlinLangTest() {
        updatePointsCredit(1)
        updatePointsCredit(2)
        updatePointsCredit(3)
        updatePointsCredit(4)

    }


}