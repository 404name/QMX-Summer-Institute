package com.qmx.work3;

public class test {
    public static void main(String[] args) {
        Shape a = new Rectiangle(2, 4);
        System.out.println("面积为：" + a.getArea() + "周长为：" + a.getPerimeter());
        a = new Circle(2);
        System.out.println("面积为：" + a.getArea() + "周长为：" + a.getPerimeter());
    }
}
