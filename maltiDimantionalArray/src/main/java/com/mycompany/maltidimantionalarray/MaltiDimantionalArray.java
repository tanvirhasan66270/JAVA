package com.mycompany.maltidimantionalarray;

public class MaltiDimantionalArray {

    public static void main(String[] args) {
        int number[][] = new int[3][4];

        number[0][0] = 1;
        number[0][1] = 2;
        number[0][2] = 3;
        number[0][3] = 4;

        number[1][0] = 5;
        number[1][1] = 6;
        number[1][2] = 7;
        number[1][3] = 8;

        number[2][0] = 9;
        number[2][1] = 10;
        number[2][2] = 11;
        number[2][3] = 12;

        for (int row = 0; row < number.length; row++) {
            for (int col = 0; col < number[row].length; col++) {
                System.out.print(number[row][col] + "\t");
            }System.out.println("\n");

        }
        
    }
}
