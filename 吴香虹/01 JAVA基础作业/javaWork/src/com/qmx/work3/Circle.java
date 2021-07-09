package com.qmx.work3;

public class Circle extends Shape{
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public void  set(double r) {
        this.r = r;
    }
    public double getArea() {
            return r * r * 3.14;
    }
    public double getPerimeter() {
        return 2 * r * r;
    }
}
