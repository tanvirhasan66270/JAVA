

package com.mycompany.caseconvart;

import java.util.Scanner;


public class CaseConvart {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("input name: ");
        String name=input.next();
        
        String first = name.substring(0,1).toUpperCase();
        String second=name.substring(1, name.length()-1).toLowerCase();
              
        
        String third=name.substring(name.length()-1).toUpperCase();
       String mainName=first+second+third;
       
        
        System.out.println(mainName);
        
        
        String number1="15";
        String number2="20";
        
        System.out.println(Integer.parseInt(number1)+Integer.parseInt(number2));
        
    }
}


