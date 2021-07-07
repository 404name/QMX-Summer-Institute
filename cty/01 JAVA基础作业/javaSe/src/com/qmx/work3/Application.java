package com.qmx.work3;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPer());
        Rectiangle rectiangle = new Rectiangle(15, 10);
        System.out.println(rectiangle.getArea());
        System.out.println(rectiangle.getPer());
    }
}
