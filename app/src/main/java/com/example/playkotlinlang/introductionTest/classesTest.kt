package com.example.playkotlinlang.introductionTest

class classesTest {
    class Customer
    class Student (var Name:String ,var id : Int) {

    }
    fun classesTestplay (){
        var customer = Customer()
        var Student = Student ("pham dinh son",9)
        println(Student("pham van tuy" , 10))
        println(Student.Name)
        println(Student.id)
        Student.Name = "Name student changer"
        println(Student.Name)
    }


}