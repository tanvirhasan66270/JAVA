

package com.mycompany.electricbill;

import java.util.Scanner;


public class ElectricBill {

    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println(" Input Bill: ");
        float bill=input.nextFloat();
        
        if(bill<=100){
        
            System.out.println("Bill: "+(bill*5));}
        else if(bill<=200){
            System.out.println("Bill: "+(bill*8));}
        else{System.out.println("Bill: "+(bill*10));}
        
    }
}
