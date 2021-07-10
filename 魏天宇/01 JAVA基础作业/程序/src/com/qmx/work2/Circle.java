package com.qmx.work2;

public class Circle {
    protected double r;
    public double getArea(){
        return this.r * this.r * Math.PI;
    }
    public void setR(double r){
        this.r = r;
    }
    public  Circle(double r){
        this.r = r;
    }
}
