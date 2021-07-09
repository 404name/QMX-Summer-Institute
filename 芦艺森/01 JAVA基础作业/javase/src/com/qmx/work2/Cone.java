package com.qmx.work2;

public class Cone extends Circle {
    private double high;

    public Cone(double h, double r) {
        super(r);
        this.high = h;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getValume() {
        return (getArea() * high) / 3;
    }

}
