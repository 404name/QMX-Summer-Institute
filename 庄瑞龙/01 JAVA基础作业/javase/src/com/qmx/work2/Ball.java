package com.qmx.work2;

public class Ball extends Circle{
    public Ball(double r){
        super(r);
    }
    public double getValume(){
        double v;
        v = r * getArea() * 4 / 3;

        return v;
    }

}
