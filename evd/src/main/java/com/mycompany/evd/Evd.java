package com.mycompany.evd;

import com.mycompany.evd.ev.Truck;

public class Evd {

    public static void main(String[] args) {
        Truck t = new Truck(3000, 100);

        System.out.println(t.getSalePrice());
    }
}
