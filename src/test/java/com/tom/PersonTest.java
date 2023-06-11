package com.tom;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {

    @Test
    void bmiTest(){
        Person person = new Person(66.5f,1.7f);
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi());
    }
}
