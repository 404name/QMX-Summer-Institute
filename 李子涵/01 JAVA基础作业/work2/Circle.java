package com.qmx.work2;

public class Circle {
    protected int R;
    protected double Area;
    public void setR(int r){
        R = r;
        Area = Math.PI * R * R;
    }
    public void getArea(){
        System.out.println("Circle 的面积为:" + Area);
    }
    public Circle(){

    }
    public Circle(int r){
        R = r;
        Area = Math.PI * R * R;
        System.out.println("Circle 的有参构造函数调用");
    }
}
