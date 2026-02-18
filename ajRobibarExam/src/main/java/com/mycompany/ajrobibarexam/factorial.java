package com.mycompany.ajrobibarexam;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        System.out.println("enter number: ");
//        int factorial = s.nextInt();
////        int factorial=5;
//        int count = 1;
//
//        for (int i = 1; i <= factorial; i++) {
//            count = count * i;
//
//        }
//        System.out.println(count);

     allFactorial();
    }

    static void allFactorial() {
        int number = 1;
         int count = 1;

        while (number >= 5) {

            number = count * number;
            number++;
            
    }System.out.println(number);
        

        }

    }
