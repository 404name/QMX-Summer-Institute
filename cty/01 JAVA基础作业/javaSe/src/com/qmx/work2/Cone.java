package com.qmx.work2;

public class Cone extends Circle {
    private int high;

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Cone(int r, int high) {
        super(r);
        this.high = high;
    }

    public Cone(int r) {
        super(r);
    }

    public int getValue(){
        return getR() * getR() * getHigh();
    }
}
