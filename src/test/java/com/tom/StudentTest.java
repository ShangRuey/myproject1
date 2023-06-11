package com.tom;

import com.tom.student.Student;
import org.junit.Test;

public class StudentTest {
    @Test
    void highestScoreTest(){
        Student student = new Student("Hank",60,60);
        Assertions.assertEquals(80,student.highest());
    }
    @Test
    void highestScoreTest(){
        Student student = new Student("Hank",60,60);
        Assertions.assertEquals(80,student.highest());
    }
    @Test
    void averageTest(){
        Student student = new Student("Hank",60,80);
        Assertions.assertEquals((60+80)/2),student.getAverage();
    }
}
