

package com.mycompany.scarcharrywithinput;

import java.util.Scanner;


public class ScarchArryWithInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input limite: ");
        int myArray = input.nextInt();
 
        int number[] = new int[myArray];
        
       

        for (int i = 0; i < myArray; i++) {
            System.out.println("input " + (i + 1) + " number");
            int userInput = input.nextInt();
            number[i] = userInput;
        }

        System.out.println("input Scarch number: ");
        int ser = input.nextInt();
        
        System.out.println(linerArray(number, ser));
        
       
    }

    public static int linerArray(int[] array, int scarchNumber) {
        int rasult = -1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == scarchNumber) {

                rasult = i;
                break;
            }
        }
        return rasult;
    }
}
