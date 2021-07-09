package com.qmx.work2;

public class Cylinder extends Circle{
    private double high;

    public void setHigh(double high) {
        this.high = high;
    }
    public double getValume(){
        return super.getArea() * this.high;
    }
    public Cylinder(double radius, double high) {
        super(radius);
        this.high = high;
    }
}
