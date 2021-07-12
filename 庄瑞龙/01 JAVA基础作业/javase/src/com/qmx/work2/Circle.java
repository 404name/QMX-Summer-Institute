package com.qmx.work2;
public class Circle {
    protected  double r;


    public void setR(double r){
        this.r = r;
    }
    public double getArea() {
        double area;
        area = 3.14 * r * r;
        return area;
    }
    public Circle(double r){
        this.r = r;
    }
}
