package com.qmx.work3;

public class test {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape rectiangle = new Rectiangle(2,4);
        System.out.println("圆的面积为：" + circle.getArea());
        System.out.println("圆的周长为：" + circle.getPerimeter());
        System.out.println("矩形的面积为：" + rectiangle.getArea());
        System.out.println("矩形的周长为：" + rectiangle.getPerimeter());
    }
}
