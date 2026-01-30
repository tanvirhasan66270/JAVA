package com.mycompany.practiceradiuspassword;

import java.util.Scanner;

public class PracticeRadiusPassword {

    public static void main(String[] args) {
        
         Scanner input=new Scanner(System.in);
         
        System.out.println("Input Radius");
        float radius=input.nextFloat();

           if( radius<=0){
               System.out.println("Incarrect Radius");}
           else{
                System.out.println("Ans: "+ (Math.PI *Math.pow(radius, 2)));
                
           }
           
        
       









//        Scanner input = new Scanner(System.in);
//        System.out.println("Input Username: ");
//        String usarname = input.nextLine();
//
//        if (usarname.equalsIgnoreCase("Poramanik")) {
//            
//            System.out.println("Input Password: ");
//            String password = input.nextLine();
//            
//            if (password.equals("pk420")) {
//                System.out.println("Welcome " + usarname);
//                
//            } else {
//                System.out.println("password incorrect");
//            }
//
//        } else {
//            System.out.println("Pleace input your correct username");
//
//        }

    }
}
