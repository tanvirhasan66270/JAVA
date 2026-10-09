/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snapshot;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class SnapShot {

   
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
         System.out.println("Input A: ");
         int a=s.nextInt();
         
         System.out.println("Input B: ");
         int b=s.nextInt();
         
         a=a+b;
         b=a-b;
         a=a-b;
         
         System.out.println("number : " + a +" "+ b);
        
    }
    
}
