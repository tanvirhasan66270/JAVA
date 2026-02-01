package com.mycompany.arraymathod;

import java.util.Scanner;

public class ArrayMathod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("input Number: ");
        int number = input.nextInt();

       int numbe= Arry(140, 20, 50, 48, 54);
        System.out.println((numbe));

    }

    public static int Arry(int... num) {
        int sum = 0;
        for (int item : num) {
            sum += item;
        }

        return sum;

    }
}
