package com.qmx.work2;

public class Cone extends Circle {
    private double high;
    public Cone(double r,double high) {
        super(r);
        this.high = high;
    }
    public void setHigh(double high){
        this.high = high;
    }
    public double getValume(){
        return 1.0 / 3 * super.getArea() * this.high;
    }
}
