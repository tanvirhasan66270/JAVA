

package com.mycompany.greadcalculation;

import java.util.Scanner;


public class GreadCalculation {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Input rasult: ");        
        int rasult=input.nextInt();
        
        if(rasult>80 && rasult<100){
            System.out.println("A+");}
        
        else if(rasult>70 && rasult<79){
            System.out.println("A");}
        
        else if(rasult>60 && rasult<69){
            System.out.println("A-");}
        else if(rasult>50 && rasult<59){
            System.out.println("B");}
        else if(rasult>40 && rasult<49){
            System.out.println("C");}
        else{System.out.println("Fail");}
    }
}
