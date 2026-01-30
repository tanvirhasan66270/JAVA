

package com.mycompany.passfail;

import java.util.Scanner;


public class PassFail {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input Rasult: ");
        int rasult=input.nextInt();
        
        if(rasult>=40){
            System.out.println("Pass");
        }else{System.out.println("Fail");}
    }
}
