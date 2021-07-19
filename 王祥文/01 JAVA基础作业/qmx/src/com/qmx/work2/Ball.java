package com.qmx.work2;

import static java.lang.Math.PI;

public class Ball extends Circle {
    public Ball(double r) {
        super(r);
    }
    public double getValume(){
        double valume = (4.0)/3 * PI * r * r * r;
        return valume;
    }
}
