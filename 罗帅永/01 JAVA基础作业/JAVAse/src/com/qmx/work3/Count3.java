package com.qmx.work3;

import java.util.Scanner;

public class Count3 {
    public Count3() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入长度:");
        double l = s.nextDouble();
        System.out.print("输入宽度:");
        double w = s.nextDouble();
        System.out.print("输入半径:");
        double r = s.nextDouble();
        Shape rectiangle = new Rectiangle(l, w);
        Shape circle = new Circle(r);
        System.out.printf("长方形的%f,%f\n", rectiangle.getArea(), rectiangle.getPerimeter());
        System.out.printf("圆形的%f,%f\n", circle.getArea(), circle.getPerimeter());
        System.out.println("输入重设的l,w,h");
        l = s.nextDouble();
        w = s.nextDouble();
        r = s.nextDouble();
        ((Rectiangle)rectiangle).SetWidth(w);
        ((Rectiangle)rectiangle).SetLength(l);
        ((Circle)circle).setR(r);
        System.out.printf("长方形的%f,%f\n", rectiangle.getArea(), rectiangle.getPerimeter());
        System.out.printf("圆形的%f,%f", circle.getArea(), circle.getPerimeter());
    }
}