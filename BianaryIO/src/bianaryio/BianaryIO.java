package bianaryio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BianaryIO {

    public static void main(String[] args) {
        
        try {
            FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\tanvir.txt");
            for(int i=1;i<=10;i++){
            fos.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BianaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BianaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream fos=new FileInputStream("C:\\Users\\Admin\\Desktop\\tanvir.txt");
            int value;
            
            while((value=fos.read()) !=-1){
            System.out.println(value+" ");
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BianaryIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BianaryIO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }

}
