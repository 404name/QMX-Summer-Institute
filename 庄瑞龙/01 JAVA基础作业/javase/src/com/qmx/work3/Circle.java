package com.qmx.work3;

public class Circle extends Shape{
    public double r, area;
    public Circle(double r){
        this.r = r;
    }
    public double getArea(){
        area = 3.14 * r * r;
        return area;
    }
    public double getPerimeter(){
        return 2 * 3.14 * r;
    }
}
