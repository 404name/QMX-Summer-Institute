package com.qmx.work2;

import static java.lang.Math.PI;

public class Circle {
    protected double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return r * r * PI;
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
        this.r = 0;
    }
}
