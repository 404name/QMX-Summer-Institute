package com.qmx.work2;

public class Cone extends Circle {
    private double high;

    public void setHigh(double high) {
        this.high = high;
    }

    public double getValume() {
        return super.getArea() * high / 3;
    }

    public Cone() {
        super();
        high = 0;
    }
    public Cone(double h,double r)
    {
        this.high=h;
        this.r=r;
    }
}
