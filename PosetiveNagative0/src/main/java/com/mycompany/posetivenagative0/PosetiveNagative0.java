

package com.mycompany.posetivenagative0;

import java.util.Scanner;


public class PosetiveNagative0 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input number: ");
        int number=input.nextInt();
         if(number==0){
             System.out.println("It is Zero");
              
         }
         if(number<0){
             System.out.println("It is Nagetive number");}
         if(number>0){
             System.out.println("It is posetive number");}
    }
}
