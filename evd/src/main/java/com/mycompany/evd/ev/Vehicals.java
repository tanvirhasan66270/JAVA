
package com.mycompany.evd.ev;


public class Vehicals {
    int speed;
    double ragularPrice;
    String color;

    public Vehicals() {
    }

    public Vehicals(double ragularPrice) {
        this.ragularPrice = ragularPrice;
    }
    
    public double  getSalePrice(){
    
    return ragularPrice;
    }
    
}
