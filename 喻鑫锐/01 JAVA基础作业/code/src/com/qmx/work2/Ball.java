package com.qmx.work2;

public class Ball extends Circle{
    public Ball(double radius) {
        super(radius);
    }

    public double getValume(){
        return (4.0/3) * Math.PI * this.getRadius() * this.getRadius() * this.getRadius();
    }
}
