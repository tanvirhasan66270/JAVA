package com.mycompany.discount;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Ammount: ");
        float ammount = input.nextFloat();

        if (ammount >= 2000) {
            System.out.println("Discount Ammount: " + (ammount * 10 / 100));
        } else if (ammount >= 5000) {
            System.out.println("Discount Ammount: " + (ammount * 20 / 100));
        } else {
            System.out.println("Discount Ammount: " + ammount);
        }
    }
}
