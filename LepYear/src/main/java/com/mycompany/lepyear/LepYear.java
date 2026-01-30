
package com.mycompany.lepyear;

import java.util.Scanner;


public class LepYear {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input Year: ");
        int year=input.nextInt();
        if( year%4==0){
            System.out.println("It is leap year");
        }else{System.out.println("It is not leap year");}
    }
}
