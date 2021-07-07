package com.qmx.work3;

public class main {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        c.getArea();
        c.getPerimeter();
        c.setR(4);
        c.getArea();
        c.getPerimeter();

        Rectiangle r = new Rectiangle(2,3);
        r.getArea();
        r.getPerimeter();
        r.setWH(3,4);
        r.getArea();
        r.getPerimeter();
    }
}
