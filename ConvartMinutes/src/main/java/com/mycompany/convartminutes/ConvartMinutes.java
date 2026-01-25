package com.mycompany.convartminutes;

import java.util.Scanner;

//public class ConvartMinutes {
//
//    public static void main(String[] args) {
//        
//        Scanner scanner=new Scanner(System.in);
//        int seconds;
//        System.out.println("Input Second");
//         seconds=scanner.nextInt();
//        
//        int minutes=seconds/60;
//        int second=seconds%60;
//        System.out.println("Minute "+minutes+" second "+second);
//    }
//}
//public class ConvartMinutes{
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int second;
//        System.out.println("Inter Second");
//        second=scanner.nextInt();
//        int hour=second/3600;
//        second = second%3600;
//        
//        int minutes=second/60;
//        
//        second = second%60;
//        System.out.println( hour +" Hour "+minutes+" Minutes " +second+ " Second ");
//                
//    }
//}
public class ConvartMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int second;
        System.out.println("Input Second");
        second=scanner.nextInt();
        int hour = second / 3600;
        second = second % 3600;
        int minutes = second / 60;
         second=second%60;
        System.out.println( hour +" Hour "+minutes+" Minutes " +second+ " Second ");

    }

}
