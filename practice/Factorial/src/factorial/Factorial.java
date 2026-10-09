/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input range: ");

        int input = s.nextInt();
//        
//        for(int i=1;i<=input;i++){
//            System.out.println("Input Number: ");
//            int number=s.nextInt();
//            int save=number;
//        int fac=1;
//            for(int j=1;j<=number;j++){
//            
//            fac=fac*j;
//            
//            }System.out.println(fac);
//        }

        for (int i = 1; i <= input; i++) {

            System.out.println("input number:");
            int number = s.nextInt();
            int save=number;
                int fac=1;
            for (int j = 1; j <= number; j++) {
               
               fac=fac*j;
            }System.out.println(fac);
        }
    }

}
