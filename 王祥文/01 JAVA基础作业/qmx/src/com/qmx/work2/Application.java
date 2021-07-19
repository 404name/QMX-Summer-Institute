package com.qmx.work2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入半径：");
        double r = s.nextDouble();
        System.out.println("请输入高：");
        double h = s.nextDouble();
        Circle  circle = new Circle(r);
        Ball ball = new Ball(r);
        Cone cone = new Cone(r,h);
        Cylinder cylinder = new Cylinder(r,h);
        System.out.println("圆的面积："+circle.getArea());
        System.out.println("球的体积："+ball.getValume());
        System.out.println("圆锥的体积："+cone.getValume());
        System.out.println("圆柱的体积："+cylinder.getValume());

    }
}
