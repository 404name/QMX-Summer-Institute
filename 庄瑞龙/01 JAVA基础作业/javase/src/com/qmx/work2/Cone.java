package com.qmx.work2;

public class Cone extends Circle{
    public double high;
    public void setHigh(){
        this.high = high;
    }
    public Cone(double r, double high){
        super(r);
        this.high = high;
    }
    public double getValume(){
        double v;
        v = high * getArea() * 1 / 3 ;
        return v;
    }
}
