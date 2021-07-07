package com.qmx.work3;

public class Circle extends Shape {
    private double r;
    private double area, per;

    public Circle(double r) {
        this.area = r * r * Math.PI;
        this.per = 2 * r * Math.PI;
        this.r = r;
    }

    public void setR(double r) {
        this.area = r * r * Math.PI;
        this.per = 2 * r * Math.PI;
        this.r = r;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPer() {
        return per;
    }

    public double getR() {
        return r;
    }
}
