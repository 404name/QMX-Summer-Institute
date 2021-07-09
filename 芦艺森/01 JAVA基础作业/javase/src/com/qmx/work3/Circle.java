package com.qmx.work3;

import static java.lang.Math.PI;

//Circle类具有类型为double的半径和面积属性，具有修改半径的功能，并实现抽象类的2个方法；
public class Circle extends Shape {
    public double r;
    private double Area;

    public Circle(double r) {
        this.r = r;
        setArea(r * r * PI);
    }

    public void setR(double r) {
        this.r = r;
        setArea(r * r * PI);
    }

    public void setArea(double area) {
        this.Area = area;
    }

    @Override
    public double getArea() {
        return Area;
    }

    @Override
    public double getPerimeter() {
        return PI * 2 * r;
    }
}
