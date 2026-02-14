package com.mycompany.userexceptionalhandelar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserExceptionalHandelar {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\tanvir.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(" Bodrul ");
            printWriter.println(" Miskat ");

            int number = 100;
            for (int i = 0; i <= number; i++) {

                printWriter.println(i);
            }
            printWriter.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserExceptionalHandelar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s=new Scanner(file);
            
            while (s.hasNext()) {
                String next = s.next();
                System.out.println(next);
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserExceptionalHandelar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
