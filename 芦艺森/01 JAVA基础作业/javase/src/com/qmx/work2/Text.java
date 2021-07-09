package com.qmx.work2;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //构造Scanner类对象

        System.out.print("输入r的值:");
        double r = s.nextDouble();
        System.out.print("输入h的值:");
        double h = s.nextDouble();

        Circle circle = new Circle(r);  //定义对象圆
        Ball ball = new Ball(r);   //定义对象球
        Cone cone = new Cone(h, r);  //定义对象圆锥
        Cylinder cylinder = new Cylinder(h, r); //定义对象圆柱

        System.out.printf("圆的面积是%f\n", circle.getArea());
        System.out.printf("球的体积是%f\n", ball.getValume());
        System.out.printf("圆锥的体积是%f\n", cone.getValume());
        System.out.printf("圆柱的体积是%f\n", cylinder.getValume());

        System.out.print("输入重设的r值:");
        r = s.nextDouble();    //重设r
        circle.setR(r);
        ball.setR(r);
        cone.setR(r);
        cylinder.setR(r);

        System.out.print("输入重设的h值:");
        h = s.nextDouble();    //重设h
        cone.setHigh(h);
        cylinder.setHigh(h);

        System.out.printf("圆的面积是%f\n", circle.getArea());
        System.out.printf("球的体积是%f\n", ball.getValume());
        System.out.printf("圆锥的体积是%f\n", cone.getValume());
        System.out.printf("圆柱的体积是%f\n", cylinder.getValume());
    }
}
