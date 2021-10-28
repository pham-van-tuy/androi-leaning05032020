package com.example.playkotlinlang

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.playkotlinlang.CollectionsKotlinLang.*
import com.example.playkotlinlang.ControlFollowTest.*
import com.example.playkotlinlang.DelegationKotlinLang.DelegationPattern
import com.example.playkotlinlang.DelegationKotlinLang.Delegationpropties
import com.example.playkotlinlang.FuntionalKotlinLang.HightOrderFuntion
import com.example.playkotlinlang.FuntionalKotlinLang.LamdaFuntion
import com.example.playkotlinlang.ProductivityBossters.DestructuringDeclarations
import com.example.playkotlinlang.ProductivityBossters.NameArguments
import com.example.playkotlinlang.ProductivityBossters.SmartCasts
import com.example.playkotlinlang.ProductivityBossters.StringTemplate
import com.example.playkotlinlang.SpecicalClass.DataClassesKotlinLang
import com.example.playkotlinlang.SpecicalClass.EnumClassKotlinLang
import com.example.playkotlinlang.SpecicalClass.ObjectKeyword
import com.example.playkotlinlang.introductionTest.classesTest
import com.example.playkotlinlang.introductionTest.funtionTest
import com.example.playkotlinlang.introductionTest.genericsTest
import com.example.playkotlinlang.introductionTest.nullSafetyTest
import com.example.playkotlinlang.scopeFuntion.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val funtionTest = funtionTest()
        val nullSafetyTest = nullSafetyTest()
        val classesTest = classesTest()
        val gennericsTest = genericsTest()
        val WhenKotlinLang = WhenKotlinLang()
        val Loopkotlinlang = LoopKotlinLang()
        val RangerKotlinTest = RangerKotlinLang()
        val equalKotlinLang = equalKotlinLang()
        val ConditionalExpression = ConditionalExpression()
        val dataClassesKotlinLang = DataClassesKotlinLang()
        val mEnumClassKotlinLang = EnumClassKotlinLang()
        val objectKeyword = ObjectKeyword()
        val hightOrderFuntion = HightOrderFuntion()
        val lamdaFuntion = LamdaFuntion()
        val ListKotlinLang = ListKotlinLang()
        val setKotlinlangg = SetKotlinlangg()
        val mapkotlinLang = MapkotlinLang()
        val fillterKotlinLang = FillterKotlinLang()
        val mapKotlinTest = mapKotlinTest()
        val anyAllNone = Any_All_None()
        val Find_FindLast = Find_FindLast()
        val first_Last = Firt_FirtLast()
        val countKotlinLang = CountKotlinLang()
        val associatebyGroupby = associateBy_groupBy()
        val partitionKotlinLang = partitionKotlinLang()
        val flatMapKotlinLang = FlatMapKotlinLang()
        val orNullKotLinLang = OrNullKotlinLang()
        val sortedKotlinLang = SortedKotlinLang()
        val mapElementAccess = MapElementAccess()
        val zipKotlinLang = zipKotlinLang()
        val getOrElse = getOrElse()
        val letKotlinLang = letKotlinLang()
        val runKotlinLang = runKotlinLang()
        val withKotlinLang = withKotlinlang()
        val applyKotlinLang = applyKotlinLang()
        val alsoKotlinLang = alsoKotlinLang()
        val delegationPattern = DelegationPattern()
        val delegationpropties = Delegationpropties ()
        val nameArguments = NameArguments ()
        val stringTemplate = StringTemplate ()
        val destructuringDeclarations =DestructuringDeclarations ()
        val smartCasts = SmartCasts()

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
        btnClassesTest.setOnClickListener {
            dataClassesKotlinLang.dataClassesTest()
        }
        btnEnumClassTest.setOnClickListener {
            mEnumClassKotlinLang.EnumClassTest()
        }
        btnObjKeywordTest.setOnClickListener {
            objectKeyword.objectKeywordTest()
        }
        btnHightOrderFunctionTest.setOnClickListener {
            hightOrderFuntion.HightOrderFuntionTest()
        }
        btnLamdaFunTest.setOnClickListener {
            lamdaFuntion.LamdaFuntionTest()
        }
        btnListTest.setOnClickListener {
            ListKotlinLang.listKotlinLangTet()
        }
        btnSetTest.setOnClickListener {
            setKotlinlangg.SetKotlinlangTest()
        }
        btnMAPTest.setOnClickListener {
            mapkotlinLang.MapkotlinLangTest()
        }
        btnFillterTest.setOnClickListener {
            fillterKotlinLang.FillterKotlinLangTest()
        }
        btnmapTest.setOnClickListener {
            mapKotlinTest.mapKotlinTest()
        }
        btnanyallnoneTest.setOnClickListener {
            anyAllNone.Any_All_None_Test()
        }
        btnFindLastTest.setOnClickListener {
            Find_FindLast.Finf_FindLastTest()
        }
        btnFirstLastTest.setOnClickListener {
            first_Last.Firt_FirtLastTest()
        }
        btnCountTest.setOnClickListener {
            countKotlinLang.CountKotlinLangTest()
        }
        btnassociateBy_groupByTest.setOnClickListener {
            associatebyGroupby.associateBy_groupByTest()
        }
        btnPartitionTest.setOnClickListener {
            partitionKotlinLang.partitionKotlinLangTest()
        }
        btnFlatMapTest.setOnClickListener {
            flatMapKotlinLang.FlatMapKotlinLangTest()
        }
        btnOrNullTest.setOnClickListener {
            orNullKotLinLang.OrNullKotlinLangTest()
        }
        btnSortedTest.setOnClickListener {
            sortedKotlinLang.SortedKotlinLangTest()
        }
        btnMapElementTest.setOnClickListener {
            mapElementAccess.MapElementAccessTest()
        }
        btnZipTest.setOnClickListener {
            zipKotlinLang.zipKotlinLangTest()
        }
        btngetOrElseTest.setOnClickListener {
            getOrElse.getOrElseTest()
        }
        btnletKotlinLangTest.setOnClickListener {
            letKotlinLang.letKotlinLangTest()
        }
        btnrunKotlinLangTest.setOnClickListener {
            runKotlinLang.runKotlinLangTest()
        }
        btnwithKotlinLangTest.setOnClickListener {
            withKotlinLang.withKotlinlangTest()
        }
        btnapplyKotlinLangTest.setOnClickListener {
            applyKotlinLang.applyKotlinLangTest()
        }
        btnAlsoKotlinLangTest.setOnClickListener {
            alsoKotlinLang.alsoKotlinLangTest()
        }
        btnDelegationPattermTest.setOnClickListener {
            delegationPattern.DelegationPatternTest()
        }
        btnDelegationProptiesTest.setOnClickListener {
            delegationpropties.DelegationproptiesTest()
        }
        btnNamedArgumentsTest.setOnClickListener {
            nameArguments.NamedArgumentsTest()
        }
        btnStringTemplateTest.setOnClickListener {
            stringTemplate.StringTemplateTest()
        }
        btnDestructuringTest.setOnClickListener {
            destructuringDeclarations.DestructuringDeclarationsTest()
        }
        btnSmartCastsTest.setOnClickListener {
            smartCasts.SmartCastsTest()
        }



    }


}