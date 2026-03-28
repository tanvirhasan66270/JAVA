/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammonth;

/**
 *
 * @author Admin
 */
public class PrintChar implements Runnable{
    private char charToPrint;
    private int times;

    public PrintChar() {
    }

    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    public PrintChar(int times) {
        this.times = times;
    }
    
    
    

    @Override
    public void run() {
        
        for(int i=1;i<times;i++){
            System.out.println(charToPrint);
        }
    }

 
    
}
