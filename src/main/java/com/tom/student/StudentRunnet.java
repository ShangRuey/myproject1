package com.tom.student;

import java.util.Scanner;

public class StudentRunnet
{
    public static void main(String[] args) {
        Student stu = new Student("Hank",90,80);
        stu.print();
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
