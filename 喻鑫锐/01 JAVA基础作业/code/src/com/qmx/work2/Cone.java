package com.qmx.work2;

public class Cone extends Circle{
    private double high;

    public void setHigh(double high) {
        this.high = high;
    }
    public double getValume(){
        return super.getArea() * this.high * (1.0 / 3);
    }
    public Cone(double radius, double high) {
        super(radius);
        this.high = high;
    }
}
