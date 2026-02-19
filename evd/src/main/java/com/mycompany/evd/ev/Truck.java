package com.mycompany.evd.ev;

public class Truck extends Vehicals {

    int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, double ragularPrice) {
        super(ragularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {

            return ragularPrice - (ragularPrice * .10);
        } else {
            return ragularPrice;
        }
    }

}
