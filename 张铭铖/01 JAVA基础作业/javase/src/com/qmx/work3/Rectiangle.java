package com.qmx.work3;

public class Rectiangle extends Shape {
    private double len, width, area, perimeter;

    public Rectiangle(double len,double width) {
        this.len = len;
        this.width = width;
        area = len*width;
        perimeter = (len+width)*2;
    }

    public void setLen(double len) {
        this.len = len;
        area = len*width;
        perimeter = (len+width)*2;
    }

    public void setWidth(double width) {
        this.width = width;
        area = len*width;
        perimeter = (len+width)*2;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }
}
