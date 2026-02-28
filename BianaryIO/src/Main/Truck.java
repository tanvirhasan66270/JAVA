/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Admin
 */
public class Truck extends Vehicles {

    double weight;

    public Truck(double weight) {
        this.weight = weight;
    }

    public Truck(double weight, double ragularPrice) {
        super(ragularPrice);
        this.weight = weight;
    }

    @Override
    public double setPrice() {

        if (weight > 2000) {

            return ragularPrice - (ragularPrice * .10);
        } else {
            return ragularPrice;
        }
    }

}
