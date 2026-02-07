package com.mycompany.classobject.geomatry;

public class Circle {

    public double radius;

    public double getArea() {

        double rasult = Math.PI * Math.pow(radius, 2);
        return rasult;
    }

    public double getPerimeter() {

        double rasult = 2 * Math.PI * radius;
        return rasult;
    }
}
