package com.tom.student;

import java.util.Scanner;

public class StudentRunner
{
    public static void main(String[] args) {
//        com.tom.kotlin.Student.getPass();

        Student.pass =20;
        Student stu = new Student("Hank",90,80);
        Student stu2 = new Student("Tom",20,30);
        GraduateStudent gstu = new GraduateStudent("Jack",55,66,60);
        stu.print();
        stu2.print();
        gstu.print();
        System.out.println("High score:"+stu.highest());
    }

    private static void userInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter student's name:");
    String name = scanner.next();
    System.out.println("Please enter student's english:");
    int english=scanner.nextInt();
    System.out.println("Please enter student's math:");
    int math=scanner.nextInt();
    Student stu = new Student(name,english,math);
    stu.print();
    System.out.println("High score:"+stu.highest());
    }
}
