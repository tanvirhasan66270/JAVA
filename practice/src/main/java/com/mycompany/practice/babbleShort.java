package com.mycompany.practice;

import java.util.Arrays;

public class babbleShort {

    public static void main(String[] args) {
        int[][] array = {
            {1, 99, 91, 11, 44},
            {0, 10, 9, 9, 11},
            {3, 23, 21, 5, 20},
            {13, 4, 45, 66, 33},
            {11, 0, 20, 56}
        };

        int tamp = 0;
        for (int[] ans : array) {
            for (int i = 0; i < ans.length; i++) {

                for (int j = 0; j < ans.length - i - 1; j++) {

                    if (ans[j] > ans[j + 1]) {
                        tamp = ans[j];
                        ans[j] = ans[j + 1];
                        ans[j + 1] = tamp;

                    }

                }

            }
        }
        System.out.println(Arrays.deepToString(array));

    }

}
