package com.qmx.work2;

public class Circle {

    protected double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {

    }

}
