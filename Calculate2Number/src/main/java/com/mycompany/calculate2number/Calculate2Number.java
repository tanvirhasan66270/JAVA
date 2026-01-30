

package com.mycompany.calculate2number;

import java.util.Scanner;


public class Calculate2Number {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Number 1:");
        int number1=input.nextInt();
        
        System.out.println("Input (+-/*)");
        String po=input.next();
        
        
         System.out.println("Number 2:");
        int number2=input.nextInt();
        
        if( po.equals("+")){
            System.out.println("Rasult: "+(number1+number2));
        }
        else if( po.equals("-")){
            System.out.println("Rasult: "+(number1-number2));
        }
        else if( po.equals("*")){
            System.out.println("Rasult: "+(number1*number2));
        }
        else if( po.equals("/")){
            System.out.println("Rasult: "+(number1/number2));
        }
    }
}
