package com.qmx.work2;

public class Circle {
    protected double r;//保护类型，子类方法可以直接访问

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return r*r*3.14;
    }
}
