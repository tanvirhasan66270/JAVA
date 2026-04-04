/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Dell
 */
public class SalesUtil {

    public static double getTotalPrice(double unitPrice, double qualtity) {
        return unitPrice * qualtity;
    }
    
    public static double getDiscountAmount(double totalPrice, double discountRate) {
        return totalPrice * discountRate / 100;
    }

    public static double getActualPrice(double totalPrice, double discountAmount) {

        return totalPrice - discountAmount;
    }
    
}
