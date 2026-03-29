
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class ExamMaltyDimationalArray {

    public static void main(String[] args) {

        int[][] MyArray = {
            {1, 99, 91, 11, 44},
            {0, 10, 9, 9, 11},
            {3, 23, 21, 5, 20},
            {13, 4, 45, 66, 33},
            {11, 0, 1, 20, 56}
        };

        for (int[] array : MyArray) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {

                    if (array[j] > array[j + 1]) {

                        int item = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = item;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
//        for (int[] array : MyArray) {
//            System.out.println(Arrays.toString(array));
//        }

        System.out.println(Arrays.deepToString(MyArray));
    }
}
