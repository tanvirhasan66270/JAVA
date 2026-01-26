package com.mycompany.geomatrymath;

import java.util.Scanner;

public class GeomatryMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float lenght = scanner.nextFloat();
        System.out.println("input length");

        float hight = scanner.nextFloat();
        System.out.println("input hight");

        double output = lenght * hight;
        double next = 2 * (lenght + hight);

        System.out.println("1: " + output);
        System.out.println("2" + next);
    }
}
