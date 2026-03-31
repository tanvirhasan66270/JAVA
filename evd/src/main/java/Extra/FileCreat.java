package Extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileCreat {

    public static void main(String[] args) {

        String file = "C:\\Users\\Admin\\Desktop\\tanvir.txt";
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 1; i <= 10; i++) {
                fos.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileCreat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileCreat.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            int value;
            while ((value = fis.read()) != -1) {
                System.out.println(value + " ");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileCreat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileCreat.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
