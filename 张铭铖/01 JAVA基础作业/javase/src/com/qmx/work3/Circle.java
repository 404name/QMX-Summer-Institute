package com.qmx.work3;

public class Circle extends Shape {
    private double r, area, perimeter;

    public Circle(double r) {
        this.r = r;
        area = r*r*3.14;
        perimeter = 2*3.14*r;
    }

    public void setR(double r) {
        this.r = r;
        area = r*r*3.14;
        perimeter = 2*3.14*r;
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
