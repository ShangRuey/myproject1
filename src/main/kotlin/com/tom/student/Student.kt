package com.tom.kotlin

fun main()
{
    val stu = Student("Jack",66,80)
    stu.print()
}

class Student(var name:String,var english:Int,var math:Int){
    fun print(){
        println(name+"\t"+english+"\t"+math+"\t"+(english+math)/2)
    }
}