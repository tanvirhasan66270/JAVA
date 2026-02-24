package com.mycompany.practice;

import java.util.Random;
import java.util.Scanner;

public class RandomPass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input");

        int passlangth = input.nextInt();
       String rasult=toPass(passlangth);
        System.out.println(rasult);

    }

    public static String toPass(int passlangth) {

        Random random = new Random();

        String pass = "";
        String finalPassword = "";

        for (int i = 1; i <= passlangth; i++) {
            int rang = random.nextInt(3) + 1;
            switch(rang) {

                case 1 -> pass += (char) (random.nextInt(26) + 65);

                case 2 -> pass += (char) (random.nextInt(26) + 97);
                case 3 -> pass += (char) (random.nextInt(10) + 48);

            }
        }
        for (int i = 1; i < pass.length(); i++) {
            if (i == pass.length() / 2) {
                finalPassword += "_" + pass.charAt(i);
            } else {
                finalPassword += pass.charAt(i);

            }
        }
      return finalPassword;
    }
}
