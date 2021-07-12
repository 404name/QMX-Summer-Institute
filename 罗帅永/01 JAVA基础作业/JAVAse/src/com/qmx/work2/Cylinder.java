package com.qmx.work2;

public class Cylinder extends Circle {
    private double high;

    public void setHigh(double high) {
        this.high = high;
    }
    public double getValume()
    {
        return super.getArea()*high;
    }
    public Cylinder(){
        super();
    }
    public Cylinder(double h,double r)
    {
        this.high=h;
        this.r=r;
    }
}
