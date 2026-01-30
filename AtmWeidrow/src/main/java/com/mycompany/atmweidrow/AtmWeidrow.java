package com.mycompany.atmweidrow;

import java.util.Scanner;

public class AtmWeidrow {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Ballance: ");

        float ballance = 5000;
        float withdrawal = input.nextFloat();

        if (ballance >= withdrawal) {
            System.out.println("Now Ballance: "+(ballance-withdrawal));
        } else {
            System.out.println("Insafficiant Ballence");
        }
    }
}
