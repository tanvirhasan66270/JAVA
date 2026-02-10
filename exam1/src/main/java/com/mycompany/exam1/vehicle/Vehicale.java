package com.mycompany.exam1.vehicle;

public class Vehicale {

    public int speed;
    public double reagularPrice;
    public String color;
    public double SalePrice;

    public Vehicale() {
    }

    public Vehicale(int speed, double reagularPrice, String color, double SalePrice) {
        this.speed = speed;
        this.reagularPrice = reagularPrice;
        this.color = color;
        this.SalePrice = SalePrice;
    }

    public Vehicale(double reagularPrice) {
        this.reagularPrice = reagularPrice;
    }
    
   public double getSalePrice(){
   
   return reagularPrice;
   }

}
