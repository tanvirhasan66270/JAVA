package evdhome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReadWrite {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream=new FileOutputStream("C:\\Users\\Dell\\Desktop\\Practice.txt");
            
            for(int i = 1; i <= 10; i++){
            outputStream.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Dell\\Desktop\\Practice.txt");
            int value;
            while((value=fileInputStream.read()) !=-1){
            
                System.out.println(value);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
