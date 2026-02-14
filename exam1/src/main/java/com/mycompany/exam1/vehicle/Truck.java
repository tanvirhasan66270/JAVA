package com.mycompany.exam1.vehicle;

public class Truck extends Vehicale {

    public int weight;

    public Truck() {
    }

    

//    public Truck(int weight) {
//        this.weight = weight;
//    }
//
//    public Truck(int weight, int speed, double reagularPrice, String color, double SalePrice) {
//        super(speed, reagularPrice, color, SalePrice);
//        this.weight = weight;
//    }
//
//    public Truck(int weight, double reagularPrice) {
//        super(reagularPrice);
//        this.weight = weight;
//
//    }
//    
//    @Override
//    public double getSalePrice() {
//       if(weight>2000){
//       return super.reagularPrice-(super.reagularPrice*0.10);
//       } 
//       else{return super.reagularPrice;}
//    }
//    

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int weight, int speed, double reagularPrice, String color, double SalePrice) {
        super(speed, reagularPrice, color, SalePrice);
        this.weight = weight;
    }

    public Truck(int weight, double reagularPrice) {
        super(reagularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if( weight>2000){
            double rasult=reagularPrice-(reagularPrice*0.10);
            return rasult;
        
        }else{
        
        return reagularPrice;
        }
        
       
    }
    
    
    
}
