package com.qmx.work3;

public class Circle extends Shape {
    public int R;
    public double Area;
    public double ZC;
    public void setR(int r){
        R = r;
        Area = Math.PI * R * R;
        ZC = 2 * Math.PI * R ;
    }

    public void getArea() {
        Area = Math.PI * R * R;
        System.out.println("圆的面积为:" + Area);
    }

    public void getPerimeter(){
        ZC = 2 * Math.PI * R ;
        System.out.println("圆的周长为:" + ZC);
    }

    public Circle(int r){
        R = r;
        Area = Math.PI * R * R;
        ZC = 2 * Math.PI * R ;
    }
}
