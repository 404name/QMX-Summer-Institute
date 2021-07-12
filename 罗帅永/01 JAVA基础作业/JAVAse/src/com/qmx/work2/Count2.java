package com.qmx.work2;

import java.util.Scanner;

public class Count2 {
    public Count2(){}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("输入r的值:");
        double r=s.nextDouble();
        System.out.println("输入h的值:");
        double h=s.nextDouble();
        Circle circle=new Circle(r);
        Ball ball=new Ball(r);
        Cone cone=new Cone(h,r);
        Cylinder cylinder=new Cylinder(h,r);
        System.out.printf("圆的面积是%f\n", circle.getArea());
        System.out.printf("球的体积是%f\n", ball.getValume());
        System.out.printf("圆锥的体积是%f\n", cone.getValume());
        System.out.printf("圆柱的体积是%f\n", cylinder.getValume());
        System.out.print("输入重设的r值:");
        r=s.nextDouble();
        circle.setR(r);
        ball.setR(r);
        cone.setR(r);
        cylinder.setR(r);
        System.out.print("输入重设的h值:");
        h = s.nextDouble();
        cone.setHigh(h);
        cylinder.setHigh(h);
        System.out.printf("圆的面积是%f\n", circle.getArea());
        System.out.printf("球的体积是%f\n", ball.getValume());
        System.out.printf("圆锥的体积是%f\n", cone.getValume());
        System.out.printf("圆柱的体积是%f\n", cylinder.getValume());
    }
}
