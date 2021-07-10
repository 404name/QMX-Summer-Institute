package com.qmx.work2;

public class Cylinder extends Circle {
    private double high;

    public Cylinder(double r,double high) {
        super(r);
        this.high = high;
    }

    public void setHigh(double high){
        this.high = high;
    }
    public double getValume(){
        return super.getArea() * this.high;
    }
}
