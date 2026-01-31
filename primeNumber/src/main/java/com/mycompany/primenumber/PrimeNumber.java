package com.mycompany.primenumber;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("input number: ");
        int number = input.nextInt();

        int count = 0;
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                count = count + 1;
            }
        }
        if (count == 2) {
            System.out.println("it is prime number: " + number);

        } else {
            System.out.println("it is not prime number: " + number);
        }
    }
}
