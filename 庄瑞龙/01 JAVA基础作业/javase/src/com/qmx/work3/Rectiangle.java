package com.qmx.work3;

public class Rectiangle extends Shape{
    public double a, b, c, area;
    public Rectiangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        area = a * b;
        return area;
    }
    public double getPerimeter(){
        c = 2 * (a + b);
        return c;
    }
}
