/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armstrong;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number: ");
        
       int input =s.nextInt();
       int save=input;
       int sum=0;
       
       while(input>0){
       
           int d=input%10;
           sum=sum+(d*d*d);
           input=input/10;
                     
           
       }if(save == sum){
        System.out.println("true");
       }else{System.out.println("not");}
    }
    
}
