

package com.mycompany.traingle;

import java.util.Scanner;

public class Traingle {

    public static void main(String[] args) { 
        Scanner input=new Scanner(System.in);
        
        System.out.println("Input 1: ");
        int a=input.nextInt();
        
        System.out.println("Input 2: ");
        int b=input.nextInt();
        
        System.out.println("Input 3: ");
        int c=input.nextInt();
        
        
        if(a+b<c||b+c<a||a+c<b ){
            System.out.println("Traingle ");}
        
        else if(a==b && b==c){System.out.println("Equilateral");}
        
        else if(a==b||b==c||c==a ){
            System.out.println(" Isosceles");}
        
        else if(a!=b || b!=c||a!=c){System.out.println("Scalene");}
        
    }
}
