/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exammonth;

/**
 *
 * @author Admin
 */
public class ExamMonth {

    public static void main(String[] args) {
        // TODO code application logic here

        Runnable r1 = new PrintChar('a', 10);
        Runnable r2 = new PrintChar('b', 10);
        Runnable r3 = new PrintChar('c', 10);
        
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);
        
        t1.start();
        t2.start();
        t3.start();
    }

}
