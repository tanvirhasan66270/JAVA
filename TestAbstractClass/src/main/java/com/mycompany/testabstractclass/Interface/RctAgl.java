
package com.mycompany.testabstractclass.Interface;


public class RctAgl implements GeoObj{
    double radius;

    public RctAgl() {
    }

    public RctAgl(double radius) {
        this.radius = radius;
    }
    
    

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getperemiter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
