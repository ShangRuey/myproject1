package com.tom

fun main()
{
//    println("Hello World");
//    Human().hello()
//    h.hello()
    val h = Human( weight = 66.5f, height = 1.7f)
    println(h.bmi())
}

class Human(var weight: Float , var height : Float)
{
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