package com.qmx.work3;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("长方形的长：");
        double a = s.nextDouble();
        System.out.println("长方形的宽：");
        double b = s.nextDouble();
        System.out.println("圆的半径：");
        double r = s.nextDouble();
        Rectiangle re = new Rectiangle(a,b);
        System.out.println("长方形的面积："+re.getArea());
        System.out.println("长方形的周长："+re.getPerimeter());
        Circle ci = new Circle(r);
        System.out.println("圆的面积："+ci.getArea());
        System.out.println("圆的周长："+ci.getPerimeter());
    }
}
