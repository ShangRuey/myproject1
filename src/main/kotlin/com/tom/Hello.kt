package com.tom

fun main()
{
//    println("Hello World");
//    Human().hello()
//    h.hello()
    val h = Human( 66.5f,1.7f)
    println(h.bmi())
    h.hello()
}

class Human(var weight: Float , var height : Float,var name:String = "")
{
    init{
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