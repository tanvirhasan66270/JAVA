/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    System.out.println("Input range");
        int range=s.nextInt();
        
       int array[]=new int[range];
        
        int num1=0;int num2=1;  
        for(int i=0;i<range;i++){
         array[i]=num1;
            
         int  sum=0;
         sum=num1+num2;
         num1=num2;
         num2=sum;
        
        }System.out.println(Arrays.toString(array));
    
    }
    
}
