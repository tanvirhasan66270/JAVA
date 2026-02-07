package com.mycompany.classobject.geomatry;

public class RactAngle {

    public double hight;
    public double width;

    public double getArea() {

        return hight * width;
    }

    public double getPerimeter() {
      return 2 * (hight + width);
    }
}
