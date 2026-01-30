

package com.mycompany.vowelconconent;

import java.util.Scanner;


public class VowelConconent {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input Carrector: ");
        String c=input.nextLine();
        
        if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")
                ||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u")){
            System.out.println("It is vawel: ");
            
        }else{System.out.println("It is conconent: ");}
    }
}
