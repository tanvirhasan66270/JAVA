

package com.mycompany.largenmber;

import java.util.Scanner;


public class LargeNmber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input number 1: ");
        int number1= input.nextInt();
        
        System.out.println("Input number 2: ");
        int number2= input.nextInt();
        
        System.out.println("Input number 3: ");
        int number3= input.nextInt();
        
        
        if(number1>=number2 && number1>=number3 ){
            System.out.println(number1+"Is a larg number");
            
        }
        else if(number2>=number1 && number2>=number3){
                    System.out.println(number2+"is a larg number");}
        
        else {
            System.out.println(number3+"is a larg number");}
    }
}
