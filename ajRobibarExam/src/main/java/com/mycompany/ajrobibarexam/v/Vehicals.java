package com.mycompany.ajrobibarexam.v;

public class Vehicals {

    int speed;
    double ragularPrice;
    String color;

    public Vehicals() {
    }

    public Vehicals(double ragularPrice) {
        this.ragularPrice = ragularPrice;
    }

    double getSalePrice() {
        return ragularPrice;

    }

}
