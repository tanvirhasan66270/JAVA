package com.mycompany.critetwodimentionalarry;

import java.util.Arrays;
import java.util.Scanner;

public class CriteTwoDimentionalArry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input row size: ");
        int rows = input.nextInt();

        System.out.println("Input colums size: ");
        int cols = input.nextInt();

        int number[][] = new int[rows][cols];

        for (int row = 0; row < number.length; row++) {

            for (int col = 0; col < number[row].length; col++) {

                System.out.println("row " + (row + 1) + " coloum " + (col + 1));
                int userInput = input.nextInt();

                number[row][col] = userInput;

            }
        }
        System.out.println(Arrays.deepToString(number));
        System.out.println(" ");
        
        for (int[] item:number) {

            for (int single:item) {

                System.out.print(single+ "\t");
            }
            System.out.println(" ");
        }
    }
}
