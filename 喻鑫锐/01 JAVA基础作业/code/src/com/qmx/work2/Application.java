package com.qmx.work2;

public class Application {
    public static void main(String[] args) {
        double radius = 2.0;
        double high = 3.0;
        Circle circle = new Circle(radius);
        Ball ball = new Ball(radius);
        Cone cone = new Cone(radius, high);
        Cylinder cylinder = new Cylinder(radius, high);

        System.out.println("圆的面积为：" + circle.getArea());
        System.out.println("球的体积为：" + ball.getValume());
        System.out.println("圆锥的体积为：" + cone.getValume());
        System.out.println("圆柱的体积为：" + cylinder.getValume());
    }
}
