package com.mycompany.testabstractclass.Math;

import javax.xml.crypto.Data;

public abstract class GeomatryObject {

    private String color;
    private boolean filled;
    private Data datecreated;

    public GeomatryObject() {
    }

    public GeomatryObject(String color, boolean filled, Data datecreated) {
        this.color = color;
        this.filled = filled;
        this.datecreated = datecreated;
    }

    @Override
    public String toString() {
        return "GeomatryObject{" + "color=" + color + ", filled=" + filled + ", datecreated=" + datecreated + '}';
    }

    public abstract void getArea();

    public abstract void getPerameter();

}
