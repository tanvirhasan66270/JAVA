/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CalculateException {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input a: ");
        int a = s.nextInt();
        System.out.println("Input b: ");
        int b = s.nextInt();
        try {
            a = a / b;
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
//        try {
//            System.out.println("Input a: ");
//        int a = s.nextInt();
//
//        System.out.println("Input b: ");
//        int b = s.nextInt();
//            int rasult = a / b;
//            System.out.println(rasult);
//        } catch (Exception e) {
//            System.out.println(e);
//        }

    }

}
