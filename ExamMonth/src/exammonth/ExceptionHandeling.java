/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammonth;

/**
 *
 * @author Admin
 */
public class ExceptionHandeling {
    public static void main(String[] args) {
        
        int [] Array={5};
        
        try {
            Array[5]=0;
            
        } catch (Exception e) {
            System.out.println("Wrong way");
        } 
        
    }
    
}
