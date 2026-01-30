package com.mycompany.age;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Age: ");
        int age = input.nextInt();

        if (age <= 13) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teen");
        } else if (age <= 59) {
            System.out.println("Adult");
        } else  {
            System.out.println("Senior");}
    }
}
