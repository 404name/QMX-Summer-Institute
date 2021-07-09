package com.qmx.work2;

public class Cylinder extends Circle {
    private double high;

    public Cylinder(double h, double r) {
        super(r);
        this.high = h;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getValume() {
        return getArea() * high;
    }
}
