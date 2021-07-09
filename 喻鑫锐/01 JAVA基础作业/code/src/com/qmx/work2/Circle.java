package com.qmx.work2;

public class Circle {
    private double radius;

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
