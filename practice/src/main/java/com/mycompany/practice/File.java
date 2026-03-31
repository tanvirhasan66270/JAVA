/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class File {
    
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Practice.txt");
            for(int i=1;i<=10;i++){
            fos.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\Practice.txt");
            
            int value;
            while(( value =fis.read()) !=-1){
            System.out.println(value+" ");
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
