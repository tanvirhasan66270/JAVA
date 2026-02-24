package com.mycompany.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserExceptionalHandelar {

    public static void main(String[] args) {
//        File file = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\practice\\src\\main\\java\\folder\\Practice.txt");
//        try {
//            PrintWriter printWriter = new PrintWriter(file);
//
//            for (int i = 0; i <= 100; i++) {
//                printWriter.println(i);
//            }
//            printWriter.close();
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(UserExceptionalHandelar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        try {
//            Scanner s = new Scanner(file);
//
//            while (s.hasNext()) {
//                String next = s.next();
//                System.out.println(next);
//
//            }
//            s.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(UserExceptionalHandelar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//       if(file.delete()){
//           System.out.println("Delete Sexyfull");}    
//       
//      



        FileHandelar fileHandelar=new FileHandelar("SAKA.txt");
        fileHandelar.creatFile();
        fileHandelar.writeFile();
        fileHandelar.readFile();
        
        
    }

}
