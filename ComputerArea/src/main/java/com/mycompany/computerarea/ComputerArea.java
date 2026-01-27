
package com.mycompany.computerarea;

import java.util.Scanner;


public class ComputerArea {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);        
                
        System.out.println("Input Radius");
        float radius=input.nextFloat();
        
        float areaOfCarcel;
        
         if( radius<=0 ){
             System.out.println("Incarrect Radius");
         
         } else{ 
             areaOfCarcel=(float) (Math.PI * Math.pow(radius, 2));
             System.out.println("Area of Carcel: "+areaOfCarcel);
         }
             
        
    }
}
