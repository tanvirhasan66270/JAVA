package com.mycompany.tax;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("Input position: ");
        String a=input.nextLine();
        
        System.out.println("Input position: ");
        String b=input.nextLine();
        
        System.out.println("Input position: ");
        String c=input.nextLine();
        
        System.out.println("Input position: ");
        String d=input.nextLine();
        
        
        if(a.equals("Married")){
            System.out.println("Input salary: ");
        float ammount=input.nextFloat();
            
        if(ammount<=8350){
        System.out.println("Salary: "+(ammount-(ammount*0.10)));}
        else if( ammount<=33950){
            System.out.println("Salary: "+(ammount-(ammount*0.15)));}
        else if( ammount<=82250){
            System.out.println("Salary: "+(ammount-(ammount*0.25)));}
        else if( ammount<=171550){
            System.out.println("Salary: "+(ammount-(ammount*0.28)));}
         else if( ammount<=372950){
            System.out.println("Salary: "+(ammount-(ammount*0.33)));}
         else{ System.out.println("Salary: "+(ammount-(ammount*0.35)));}
        }
        
        
        
        if(b.equals("Married Filing Jointly ")){
            System.out.println("Input salary: ");
        float ammount=input.nextFloat();
            
        if(ammount<=16700){
        System.out.println("Salary: "+(ammount-(ammount*0.10)));}
        else if( ammount<=67900){
            System.out.println("Salary: "+(ammount-(ammount*0.15)));}
        else if( ammount<=137050){
            System.out.println("Salary: "+(ammount-(ammount*0.25)));}
        else if( ammount<=208850){
            System.out.println("Salary: "+(ammount-(ammount*0.28)));}
         else if( ammount<=372950){
            System.out.println("Salary: "+(ammount-(ammount*0.33)));}
         else{ System.out.println("Salary: "+(ammount-(ammount*0.35)));}
        }
        
        
        if(c.equals("Married Filing Separately")){
            System.out.println("Input salary: ");
        float ammount=input.nextFloat();
            
        if(ammount<=8350){
        System.out.println("Salary: "+(ammount-(ammount*0.10)));}
        else if( ammount<=33950){
            System.out.println("Salary: "+(ammount-(ammount*0.15)));}
        else if( ammount<=68525){
            System.out.println("Salary: "+(ammount-(ammount*0.25)));}
        else if( ammount<=104425){
            System.out.println("Salary: "+(ammount-(ammount*0.28)));}
         else if( ammount<=186475){
            System.out.println("Salary: "+(ammount-(ammount*0.33)));}
         else{ System.out.println("Salary: "+(ammount-(ammount*0.35)));}
        }
        
        
        if(d.equals("Head of Household")){
            System.out.println("Input salary: ");
        float ammount=input.nextFloat();
            
        if(ammount<=11950){
        System.out.println("Salary: "+(ammount-(ammount*0.10)));}
        else if( ammount<=45500){
            System.out.println("Salary: "+(ammount-(ammount*0.15)));}
        else if( ammount<=117450){
            System.out.println("Salary: "+(ammount-(ammount*0.25)));}
        else if( ammount<=190200){
            System.out.println("Salary: "+(ammount-(ammount*0.28)));}
         else if( ammount<=372950){
            System.out.println("Salary: "+(ammount-(ammount*0.33)));}
         else{ System.out.println("Salary: "+(ammount-(ammount*0.35)));}
        }
        
        
        }
    }

