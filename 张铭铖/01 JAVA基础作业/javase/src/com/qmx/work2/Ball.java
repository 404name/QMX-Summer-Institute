package com.qmx.work2;

public class Ball extends Circle{
    public Ball(double r) {
        super(r);//super，访问父类成员关键词
    }

    public double getValume(){
        return 4*3.14*r*r*r/3;
    }
}
