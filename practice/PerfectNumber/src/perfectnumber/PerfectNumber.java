/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perfectnumber;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input Number : ");

//        int number = s.nextInt();
//
//        int save = number;
//        String k = "";
//        int r = 0;
//        for (int i = 1; i < number; i++) {
//
//            if (number % i == 0) {
//                r = r + i;
//                
//                
//                if (k.isEmpty()) {
//
//                    k = String.valueOf(i);
//                } else {
//
//                    k = k + "+" + i;
//                }
//            }
//
//        }
//        if (r == save) {
//            System.out.println(k);
//        }else{System.out.println("not");}
        int number = s.nextInt();

        int save = number;

        int r = 0;
        String devide = "";
        int i = 1;

        while (i < number) {

            if (number % i == 0) {

                r = r + i;

                if (devide.isEmpty()) {

                 devide = String.valueOf(i);
                } else {
                    devide = devide + "+" + i;
                }
                
            }
            i++;
        } if(r==save){
                System.out.println(devide);
            }else{System.out.println("not");}
    }

}
