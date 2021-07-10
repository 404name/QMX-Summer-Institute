package com.qmx.work3;

public class Rectiangle extends Shape{
    private double width;
    private double high;
    public void set(double width,double high){
        this.width = width;
        this.high = high;
    }
    @Override
    double getArea() {
        return width * high;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + high);
    }
}