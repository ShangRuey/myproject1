package com.tom.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        /*int sum=0;
        for(int i =1; i<=100;i++){
            sum =sum+i;
        }
        System.out.println(sum);*/
        int secret = new Random().nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(secret);
        for (int i=1;i<=5;i++){
            System.out.println("Please enter a number: ("+i+"/4)");
            int number =scanner.nextInt();
            System.out.println(i +"chance"+number);
            if (number >secret){
                System.out.println("Lower");
            }else if (number <secret){
                System.out.println("Higher");
            }else{
                System.out.println("Great,the number is "+number);
                break;
            }
//            if (number ==-1){
//                break;
//            }
        }

    }
}
