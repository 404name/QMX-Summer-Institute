package com.qmx.work2;

public class test {
    public static void main(String[] args) {
        double r = 2;
        double h = 4;
        Circle circle = new Circle(r);
        Ball ball = new Ball(r);
        Cone cone = new Cone(r,h);
        Cylinder cylinder = new Cylinder(r,h);
        System.out.println("圆的面积为：" + circle.getArea());
        System.out.println("球的体积为：" + ball.getValume());
        System.out.println("圆锥的体积为：" + cone.getValume());
        System.out.println("圆柱的体积为：" + cylinder.getValume());
    }
}
