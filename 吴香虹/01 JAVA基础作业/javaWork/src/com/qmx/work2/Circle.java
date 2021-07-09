package com.qmx.work2;

public class Circle {
    protected double r;
    public Circle(double r) {
        this.r = r;
    }
    public void setR(double a) {
        this.r = a;
    }
    public double getArea() {
        return 3.14 * r * r;
    }
}
