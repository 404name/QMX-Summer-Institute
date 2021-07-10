package com.qmx.work3;

public class Circle extends Shape {
    private double r;
    public void set(double r){
        this.r = r;
    }
    @Override
    double getArea() {
        return 3.14 * r * r;
    }

    @Override
    double getPerimeter() {
        return 2 * 3.14 * r;
    }
}