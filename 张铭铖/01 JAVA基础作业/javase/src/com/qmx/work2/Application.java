package com.qmx.work2;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(1.5);
        Ball ball = new Ball(2.5);
        Cone cone = new Cone(10, 3.5);
        System.out.println("圆的面积:"+circle.getArea());
        System.out.println("球的体积:"+ball.getValume());
        System.out.println("圆锥的体积:"+cone.getValume());
        circle.setR(15);
        ball.setR(25);
        cone.setR(100);
        cone.setHigh(35);
        System.out.println("圆的面积:"+circle.getArea());
        System.out.println("球的体积:"+ball.getValume());
        System.out.println("圆锥的体积:"+cone.getValume());
    }
}
