package com.qmx.work3;

public class Circle extends Shape {
    public double r;
    private double Area;
    public void setArea(double area)
    {
        this.Area=area;
    }

    public void setR(double r)
    {
        this.r=r;
        this.setArea(r*r*3.14);
    }

    public Circle (double r){
        this.r=r;
        this.setArea(r*r*3.14);
    }

    public double getArea()
    {
        return this.Area;
    }

    public double getPerimeter()
    {
        return 6.28*this.r;
    }
}
