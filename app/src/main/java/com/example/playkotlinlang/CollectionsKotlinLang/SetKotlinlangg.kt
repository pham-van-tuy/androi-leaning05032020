package com.example.playkotlinlang.CollectionsKotlinLang

class SetKotlinlangg {
    val openIssues: MutableSet<String> =
        mutableSetOf("Issues 1", "Issues 2", "Issues 3", "Issues 4")

    fun addIssues(Issues: String): Boolean {
        return openIssues.add(Issues)
    }

    fun getStatusLog(isAdded: Boolean): String {
        return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
    }

    fun SetKotlinlangTest() {
        val addNewIssues = "new issues 01"
        val IssuesDuplicate = "Issues 1"
        println(getStatusLog(addIssues(IssuesDuplicate)))    // it is same issue will print duplicate
        println(getStatusLog(addIssues(addNewIssues)))      // it is new issue will print correctly
        addIssues("kdkdkd")
        println(openIssues)

    }
}