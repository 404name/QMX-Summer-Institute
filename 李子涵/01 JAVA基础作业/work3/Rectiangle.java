package com.qmx.work3;

public class Rectiangle {
    public int wide;
    public int high;
    public int Area;
    public int ZC;
    public void setWH(int w, int h){
        wide = w;
        high = h;
        Area = wide * high;
        ZC = 2 * ( wide + high);
    }

    public void getArea() {
        Area = wide * high;
        System.out.println("矩形的面积为:" + Area);
    }

    public void getPerimeter(){
        ZC = 2 * ( wide + high);
        System.out.println("矩形的周长为:" + ZC);
    }

    public Rectiangle(int w, int h){
        wide = w;
        high = h;
        Area = wide * high;
        ZC = 2 * ( wide + high);
    }





}
