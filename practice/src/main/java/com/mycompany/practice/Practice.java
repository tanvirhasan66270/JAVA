package com.mycompany.practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input Number: ");
        int number = input.nextInt();
        preimeNumber(number);

    }

    static void preimeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println("prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

    }
}
