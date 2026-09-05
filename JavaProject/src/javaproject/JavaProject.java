package javaproject;

import java.util.Scanner;

public class JavaProject {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Prime number:");

        int number = s.nextInt();
        int primeNumer = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                primeNumer++;
            }
        }

        if (primeNumer == 2) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }

        s.close();
    }
}