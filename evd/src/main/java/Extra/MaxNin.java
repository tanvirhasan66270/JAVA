package Extra;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arry = new int[5];

        for (int i = 0; i < arry.length; i++) {
            System.out.println("Input Number: ");
            arry[i] = s.nextInt();

        }
        System.out.println(Arrays.toString(arry));
        int max = arry[0];
        int min = arry[0];

        for (int i = 1; i < arry.length; i++) {

            if (arry[i] > max) {
                max = arry[i];
            }
            
            if (arry[i] < min) {
                min = arry[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
