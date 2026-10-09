/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Enter a number: ");
//            int input = s.nextInt();
//
//            int original = input;
//            int reverse = 0;
//
//            while (input > 0) {
//                int digit = input % 10;
//                reverse = reverse * 10 + digit;
//                input = input / 10;
//            }
//
//            if (original == reverse) {
//                System.out.println("It's a palindrome");
//            } else {
//                System.out.println("Not a palindrome");
//            }
//
//            System.out.print("Do you want to check another number? (yes/no): ");
//            String choice = s.next();
//
//            if (choice.equalsIgnoreCase("no")) {
//                break;
//            }
//        }


Scanner s = new Scanner(System.in);

         while(s.hasNext()){
            int input=s.nextInt();
            
            int save=input;
            
            int r=0;
            
            while(input>0){
            
            int dev=input % 10;
            r=r*10+dev;
            input =input/10;
            
            }if(save == r){System.out.println("its true");}
            else{System.out.println("its not true");}
            
            
             System.out.println("r u went more input yes/no");
             
             String chose=s.next();
             if(chose.equalsIgnoreCase("no")){
             
             break;
             }
                
               }

        s.close();
    }
    
    
//    
//     Scanner s = new Scanner(System.in);
//         System.out.println("Input 1 :");
//        int count=s.nextInt();
//        for(int i=1;i<=count;i++){
//            
//            
//            System.out.println("input "+(i+1)+" :");
//            
//            int input = s.nextInt();
//             
//
//            int save = input;
//            int r = 0;
//             int tamp=input;
//            while (tamp > 0) {
//                int dev = tamp % 10;
//
//                r = r * 10 + dev;
//                tamp = tamp / 10;
//
//            }if(save == r){
//            
//            System.out.println("its plaindrom\n");
//            }else{System.out.println("not plaindrom\n");}
//
//        }s.close();
//    }

}
