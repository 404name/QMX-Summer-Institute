package com.qmx.work3;

public class Rectiangle extends Shape{
    private double a;
    private double b;
    private double area;
    private double perimeter;
    public Rectiangle(double a,double b){
        this.a = a;
        this.b = b;
    }
    public void modify(double a,double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }
}
