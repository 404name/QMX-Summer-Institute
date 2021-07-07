package com.qmx.work2;

public class Ball extends Circle{
    protected double Val;
    public void getValume() {
        Val = (4/3) * Math.PI * R * R * R ;
        System.out.println("Ball 的体积为:" + Val);
    }
    Ball(int r){
        R = r;
        System.out.println("Ball 的有参构造函数调用");
    }

}
