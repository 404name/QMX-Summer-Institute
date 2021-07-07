package com.qmx.work2;

public class Cone extends Circle{
    private int High;
    protected double Val;
    public void setHigh(int high){
        High = high;
    }
    public void getValume() {
        Area = Math.PI * R * R;
        Val = (Area * High) / 3;
        System.out.println("Cone 的体积为:" + Val);
    }
    public void showSelf(){
        System.out.println("Cone 的半径为:" + R);
        System.out.println("Cone 的面积为:" + Area);
        System.out.println("Cone 的高为:" + High);
    }
    Cone(int high, int r){
        High = high;
        R = r;
        Area = Math.PI * R * R;
        System.out.println("Cone 的有参构造函数调用");
    }

}
