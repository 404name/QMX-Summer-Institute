package com.qmx.work2;

public class Ball extends Circle {

    public Ball(double r) {
        super(r);
    }

    public double getValume(){
        return 4.0 / 3 * Math.pow(this.r,3) * Math.PI;
    }
}
