package com.mycompany.classobject;

import com.mycompany.classobject.geomatry.Circle;

public class ClassObject {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.radius = 15;
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Circle circle1 = new Circle();
        circle1.radius = 8;
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

    }
}
