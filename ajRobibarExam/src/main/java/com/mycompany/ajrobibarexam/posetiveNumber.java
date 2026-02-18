package com.mycompany.ajrobibarexam;

import java.util.Scanner;

public class posetiveNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number: ");
        int input = s.nextInt();
        int sum = 0;

        while (input >= 0) {
            sum = sum + input;
            System.out.println("enter number: ");
            input = s.nextInt();

        }s.close();
        System.out.println("Sum is:"+sum);
    }

}
