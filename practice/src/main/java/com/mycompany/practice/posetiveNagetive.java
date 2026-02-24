
package com.mycompany.practice;

import java.util.Scanner;




public class posetiveNagetive {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("input Number: ");
        int number=input.nextInt();
        toNumber(number);
     
    }
    
   static void toNumber(int number){
    
    if(number==0){
        System.out.println("It is 0 ");
    }
    else if(number<0){
    
        System.out.println("It is Negative Number ");
    }
    
    else if(number>0){
    
        System.out.println("It is positive Number ");
    }
    
    
    }
    
}
