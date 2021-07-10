package com.qmx.work3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Rectiangle A = new Rectiangle();
        System.out.println("请输入长方形宽高：");
        Scanner in = new Scanner(System.in);
        double we = in.nextDouble();
        double hi = in.nextDouble();
        A.set(we,hi);
        System.out.println("面积"+A.getArea()+"周长"+ A.getPerimeter());
        System.out.println("圆形类似，此处不作测试");
    }
}