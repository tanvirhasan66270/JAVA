package com.mycompany.exam1;

import com.mycompany.exam1.vehicle.Truck;

public class VehicleExam1 {

    public static void main(String[] args) {
        Truck cal=new Truck();
       cal.weight=2005;
       cal.reagularPrice=100;
    
        System.out.println(cal.getSalePrice());
   
    }
}
