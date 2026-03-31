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

    double weadth;

    public Truck(double weadth) {
        this.weadth = weadth;
    }

    public Truck(double weadth, double ragularPrice) {
        super( ragularPrice);
        this.weadth = weadth;
    }

    @Override
    public double setRagularPrice() {
        if (weadth > 2000) {
            return ragularPrice - (ragularPrice * .10);
        }else{return ragularPrice;}
    }

}
