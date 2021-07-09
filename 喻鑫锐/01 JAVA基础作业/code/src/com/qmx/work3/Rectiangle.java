package com.qmx.work3;

public class Rectiangle extends Shape {

    private double length;
    private double width;
    private double area;
    private double perimeter;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectiangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        this.area = this.length * this.width;
        return this.area;
    }

    @Override
    public double getPerimeter() {
        this.perimeter = 2.0 * (this.length + this.width);
        return this.perimeter;
    }
}
