package com.tom;

public class Hello
{
    public static void main(String[] args)
    {
//        System.out.println("Hello world");
        String s = null;
        String a ="abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(a.substring(3));

        Person p = new Person( "Tom",66.5f,1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
//        System.out.println(score > 60 || score < 90);
        System.out.println(score > 60 && score < 90);
        char c = 'A';
        System.out.println(c > 60);
        System.out.println(c > 'a');
    }
}
