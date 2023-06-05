package com.tom;

public class Hello
{
    public static void main(String[] args)
    {
//        System.out.println("Hello world");
        Person p = new Person( "Tom",66.5f,1.7f);
        p.hello();
        System.out.println(p.bmi());
    }
}
