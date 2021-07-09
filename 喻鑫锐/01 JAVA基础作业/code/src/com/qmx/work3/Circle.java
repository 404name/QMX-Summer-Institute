package com.qmx.work3;

public class Circle extends Shape{
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        this.area = Math.PI * this.radius * this.radius;
        return this.area;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2.0 * this.radius;
    }
}
