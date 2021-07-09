package com.qmx.work3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 0;
        double width = 0,length = 0;
        System.out.print("请输入圆的半径：");
        radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.print("请输入长方形的长：");
        length = scanner.nextDouble();
        System.out.print("请输入长方形的宽：");
        width = scanner.nextDouble();
        Rectiangle rectiangle = new Rectiangle(length, width);
        System.out.println("圆的面积为：" + circle.getArea());
        System.out.println("长方形的面积为：" + rectiangle.getArea());
        System.out.println("长方形的周长为：" + rectiangle.getPerimeter());



    }
}
