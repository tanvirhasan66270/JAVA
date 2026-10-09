/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countdigits;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class CountDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input Number: ");
        int number = s.nextInt();
        int save = number;

        int count = 0;
        
        
        if(number == 0){
        count=1;
        
        }else{
        
            if(number<0){
            number=-number;
            
            }
            
            while(number>0){
            
            number=number/10;
             count++;           
            }
     
        
        }
        System.out.println(count);
    }

}
