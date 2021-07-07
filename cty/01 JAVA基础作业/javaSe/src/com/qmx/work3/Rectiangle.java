package com.qmx.work3;

public class Rectiangle extends Shape {
    private double len, width, area, per;

    public Rectiangle(double len, double width) {
        this.len = len;
        this.width = width;
        this.area = len * width;
        this.per = len * 2 + width * 2;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.area = len * width;
        this.per = len * 2 + width * 2;
        this.len = len;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.area = len * width;
        this.per = len * 2 + width * 2;
        this.width = width;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPer() {
        return per;
    }

}
