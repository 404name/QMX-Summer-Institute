package com.qmx.work3;

public class Rectiangle extends Shape{
    private double length;
    private double width;
    public Rectiangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void set(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
