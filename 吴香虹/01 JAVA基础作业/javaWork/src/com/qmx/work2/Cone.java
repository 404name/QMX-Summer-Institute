package com.qmx.work2;

public class Cone extends Circle{
    protected double height;
    public Cone(double r, double height) {
        super(r);
        this.height = height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getValume() {
        Circle circle = new Circle(r);
        double area = circle.getArea();
        return area * height / 3;
    }
}
