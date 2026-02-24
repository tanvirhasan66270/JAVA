package com.mycompany.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandelar {

    private String filePath;
    private File fileName;

    public FileHandelar(String filePath) {
        this.filePath = filePath;
    }

    public void creatFile() {

        fileName = new File(filePath);
        try {
            if (fileName.createNewFile()) {
                System.out.println("Successfully Create");
            }
        } catch (IOException ex) {
            Logger.getLogger(FileHandelar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void writeFile() {
        fileName = new File(filePath);

        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            printWriter.println("Now Bodrul And Emon khaice Saka ");
            printWriter.println("So They Are Single Akhon");

            printWriter.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandelar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void readFile() {

        fileName = new File(filePath);
        try {
            Scanner s = new Scanner(fileName);
            while (s.hasNextLine()) {
                String next = s.nextLine();
                System.out.println(next);

            }
            s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandelar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fileDelet() {
        fileName = new File(filePath);

        if (fileName.delete()) {

            System.out.println("Successfully Deleted");
        }

    }
}
