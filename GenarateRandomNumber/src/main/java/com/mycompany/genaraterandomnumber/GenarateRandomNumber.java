package com.mycompany.genaraterandomnumber;

import java.util.Scanner;

public class GenarateRandomNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("input weight");
//        int BMI = input.nextInt();
//
//        if (18.5 < BMI ) {
//            System.out.println("Under Wight");
//        } else if (BMI < 25.0) {
//            System.out.println("Normal");
//        } else if (BMI < 30.0) {
//            System.out.println("Normal");
//        } else {
//            System.out.println("Obese");
//        }
//        System.out.println("Input position");
//        int number = input.nextInt();
//          
//        if (number %2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("even");
//
//        }
        System.out.println("INPUT number1: ");
        int number1 = input.nextInt();

        System.out.println("Input number2: ");
        int number2 = input.nextInt();

        System.out.println("enter (+ - * /)");
        String op = input.next();
        
        if ( op.equals("+")){
            System.out.println("ans: "+(number1 + number2));
        }
        
         
//        switch(op){
//            case "+": System.out.println("ans: "+(number1 + number2));
//                    break;
//                    
//            case "-":System.out.println("ans: "+(number1 - number2));
//            break;
//            case "*": System.out.println("ans: "+(number1 * number2));
//            break;
//            
//            case"/":System.out.println("ans: "+(number1 / number2));
//        
//        }
        

//        if (op.equals("+")) {
//            System.out.println("ans: "+(number1 + number2));
//        } else if (op.equals("-")) {
//            System.out.println("ans: "+(number1 - number2));
//        } else if (op.equals("*")) {
//            System.out.println("ans: "+(number1 * number2));
//        } else if (op.equals("/")) {
//            System.out.println("ans: "+(number1 / number2));
//        }
    }
}
