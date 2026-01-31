package com.mycompany.guessgame;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 10);
        System.out.println(randomNumber);

        int chance = 3;

        boolean flag = false;
        System.out.println("guess number between 0-9");

        while (chance >= 1) {

            System.out.println("Enter your guess number (" + chance + " chance left): ");
            int guessNumber = input.nextInt();

            if (randomNumber == guessNumber) {
                System.out.println("you are win");
                flag = true;
                break;
            } else if (randomNumber > guessNumber) {
                System.out.println("your number is smaller than random number");

            } else {
                System.out.println("your number is bigger than random number");

            }

            chance--;

        }
        if (!flag) {
            System.out.println("Butter luck next time: ");
        }

        System.out.println("your guess number is: " + randomNumber);
    }

}
