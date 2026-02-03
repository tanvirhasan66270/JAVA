package com.mycompany.practicearray;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number of compare arry number: ");
        int n = input.nextInt();

        int numbers[] = new int[n];

        System.out.println("Begining of loop " + Arrays.toString(numbers));

        for (int index = 0; index < n; index++) {
            System.out.println("Enter your " + (index + 1) + " number: ");

            int userInput = input.nextInt();
            numbers[index] = userInput;

        }

        System.out.println("Ending of Loop " + Arrays.toString(numbers));

//        maxNumber(numbers);
        avgNumber(numbers);
    }

//    public static void maxNumber(int[] numbers) {
//        int max = 0;
//
//        for (int i : numbers) {
//            if (i >= max) {
//                max = i;
//            }
//        }
////
//        int min = numbers[0];
//        for (int i : numbers) {
//
//            if (min >= i) {
//                min = i;
//                i++;
//
//            }
//        }
//
//        System.out.println("Min number:" + min);
//
//    }
    public static void avgNumber(int[] numbers) {

        int size = numbers.length;
        int sum = 0;

        float avg = 0;

        for (int i : numbers) {
            sum += i;

        }

        avg = sum / size;
        System.out.println("avg number:" + avg);
    }
    
   
}
