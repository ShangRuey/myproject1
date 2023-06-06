package com.tom

fun main()
{
//    println("Hello World");
//    Human().hello()
//    h.hello()
    var s :String?="abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))

    val h = Human(66.5f,1.7f)
    println(h.bmi())
    h.hello()
    val score = 88
    println(score > 60)
    val c :Char = 'A'
    println(c.toInt()>60)//需要用Char裡的toInt 方法做比較
}

class Human(var weight: Float , var height : Float,var name:String = "")
{
    init
    {
        println("test $weight")
    }
//    constructor(name: String, weight: Float, height: Float) :   this(weight,height)
    fun bmi() :Float
    {
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello()
    {
        println("Hello kotlin")
    }
}