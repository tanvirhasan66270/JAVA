/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammonth;

/**
 *
 * @author Admin
 */
public class Recursion {

    public static void main(String[] args) {
       
        System.out.println( Rec(5));
    }

    public static int Rec(int i) {

        if (i == 0) {
            return 1;
        } else {
            return i * Rec(i - 1);
        }

    }
}
