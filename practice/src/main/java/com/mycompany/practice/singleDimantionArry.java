package com.mycompany.practice;

import java.util.Arrays;
import java.util.Random;
import javax.crypto.AEADBadTagException;

public class singleDimantionArry {

    public static void main(String[] args) {
        int[] input = new int[100];

        for (int i = 0; i < input.length; i++) {

            Random s = new Random();
            int num = s.nextInt(100) + 1;
            input[i] = num;

        }
        int sum = 0;
        for (int value : input) {

            sum += value;

        }
        int avg = sum / input.length;

        int high = 0;
//        int index = 0;
        for (int value : input) {
            if (value > avg) {

                high+=1;
//                input[index]=value;
//                index++;
            }

        }

        System.out.println(Arrays.toString(input));
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(high);

    }
}
