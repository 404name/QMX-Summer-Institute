package com.qmx.work2;

import static java.lang.Math.PI;

public class Ball extends Circle {
    public Ball(double r) {
        this.r = r;
    }

    public double getValume() {
        return (4 * PI * r * r * r) / 3;
    }

}
