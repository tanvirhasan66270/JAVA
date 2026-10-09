/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcdandlcm;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class GCDandLCM {

//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Iput1:");
//        int number1 = s.nextInt();
//
//        System.out.println("Input2: ");
//        int number2 = s.nextInt();
//
//        int x = number1;
//        int y = number2;
//
//        while (x != y) {
//
//            if (x > y) {
//                x = x - y;
//
//            } else {
//                y = y - x;
//            }
//            
//        }int g=x;
//        
//        int l=(number1*number2)/g;
//        System.out.println(g);
//        System.out.println(l);
//
//    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input1:");
        int input1 = s.nextInt();
        System.out.println("input2:");

        int input2 = s.nextInt();

        int n1 = input1;
        int n2 = input2;

        while (n1 != n2) {

            if (n1 > n2) {
                n1 = n1 - n2;

            } else {
                n2 = n2 - n1;
            }

        }
        int g = n1;

        int l = (input1 * input2) / g;

        System.out.println("erf"+g);
        System.out.println("ewr"+l);

    }
}
