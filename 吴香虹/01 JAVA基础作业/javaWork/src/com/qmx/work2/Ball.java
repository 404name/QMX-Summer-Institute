package com.qmx.work2;

public class Ball extends Circle{
    public Ball(double r) {
        //调用父类的构造方法
        super(r);
    }
    public double getValume() {
        double radius = r;
        return  3.14 * radius * radius * radius *3 / 4;
    }
}
