package com.example.playkotlinlang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playkotlinlang.ControlFollowTest.*
import com.example.playkotlinlang.introductionTest.classesTest
import com.example.playkotlinlang.introductionTest.funtionTest
import com.example.playkotlinlang.introductionTest.genericsTest
import com.example.playkotlinlang.introductionTest.nullSafetyTest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val funtionTest = funtionTest ()
        val nullSafetyTest = nullSafetyTest ()
        val classesTest = classesTest ()
        val gennericsTest = genericsTest ()
        val WhenKotlinLang = WhenKotlinLang ()
        val Loopkotlinlang = LoopKotlinLang ()
        val RangerKotlinTest = RangerKotlinLang ()
        val equalKotlinLang = equalKotlinLang ()
        val ConditionalExpression = ConditionalExpression ()

        btnFuntionTest.setOnClickListener {
            funtionTest.funtionTestPlay()
        }
        btnNullSafetyTest.setOnClickListener {
            nullSafetyTest.nullSafetyTestPlay()
        }
        btnClassesTest.setOnClickListener {
            classesTest.classesTestplay()
        }
        btnGenericsTest.setOnClickListener {
            gennericsTest.genericsTestPlay()
        }
        btnWhenTest.setOnClickListener {
            WhenKotlinLang.WhenKotlinTestPlay()
        }
        btnLoopTest.setOnClickListener {
            Loopkotlinlang.LoopKotlinTest()
        }
        btnRangerTest.setOnClickListener {
            RangerKotlinTest.RangerkotlinTest()
        }
        btnEqualTest.setOnClickListener {
            equalKotlinLang.EqualKotlinLangTest()
        }
        btnConditionalExpressionTest.setOnClickListener {
            ConditionalExpression.ConditionalExpressionTestPlay()
        }


    }
}