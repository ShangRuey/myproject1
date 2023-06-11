package com.tom

import com.tom.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{
    @Test
    fun highestTest(){
        val student = Student("Hank",60,80)
        Assertions.assertEquals(80,student.highest())
    }


}