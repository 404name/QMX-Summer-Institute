package com.qmx.work2;

public class Cylinder extends Circle {
    private int high;

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Cylinder(int r, int high) {
        super(r);
        this.high = high;
    }

    public int getValue(){
        return getR() * getHigh() * getR() * 3;
    }
}
