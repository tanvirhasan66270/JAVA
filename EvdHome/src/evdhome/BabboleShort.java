package evdhome;

import java.util.Arrays;
import java.util.Scanner;

public class BabboleShort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] array = new int[3];

        //   int[] array = {10, 20, 70, 80, 50, 60};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input Number: ");
            array[i] = s.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int tamp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tamp;
                }

            }
        }
        System.out.println(Arrays.toString(array));

    }

}
