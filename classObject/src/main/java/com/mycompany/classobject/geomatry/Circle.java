package com.mycompany.classobject.geomatry;

public class Circle {

    public double radius;

    public double getArea() {

        double rasult = Math.PI * Math.pow(radius, 2);
        return rasult;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    

    
    public double getPerimeter() {

        double rasult = 2 * Math.PI * radius;
        return rasult;
    }
}
