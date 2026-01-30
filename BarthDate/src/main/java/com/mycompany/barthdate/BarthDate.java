package com.mycompany.barthdate;

import java.util.Scanner;

public class BarthDate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String set1 = """
                       1 3 5 7
                      9 11 13 15
                      17 19 21 23
                      25 27 29 31""";
        String set2 = """
                     2  3  6  7
                    10 11 14 15
                    18 19 22 23
                    26 27 30 31""";
        String set3 = """
                      4  5  6  7
                      12 13 14 15
                      20 21 22 23
                      28 29 30 31                  
                    """;
        String set4="""
                    8  9 10 11
                    12 13 14 15
                    24 25 26 27
                    28 29 30 31
                    """;
        String set5="""
                    16 17 18 19
                    20 21 22 23
                    24 25 26 27
                    28 29 30 31
                    """;
        
        
        int day=0;
        System.out.println(set1+" if your barthday in this - You input \n Input yes=1/no=0: ");
        int answere1=input.nextInt();
        
         System.out.println(set2+" if your barthday in this - You input \n Input yes=1/no=0: ");
        int answere2=input.nextInt();
        
         System.out.println(set3+" if your barthday in this - You input \n Input yes=1/no=0: ");
        int answere3=input.nextInt();
        
         System.out.println(set4+" if your barthday in this - You input \n Input yes=1/no=0: ");
        int answere4=input.nextInt();
        
         System.out.println(set5 +" if your barthday in this() - You input \n Input yes=1/no=0: ");
        int answere5=input.nextInt();
        
        
        if(answere1==1){
        day=day+1;}
                   
        if(answere2==1){
        day=day+2;}
        
        if(answere3==1){
        day=day+4;}
        
        if(answere4==1){
        day=day+8;}
        
        if(answere5==1){
        day=day+16;}
        
        System.out.println("Your Barthday Date is: "+ day);
        
    }
}
