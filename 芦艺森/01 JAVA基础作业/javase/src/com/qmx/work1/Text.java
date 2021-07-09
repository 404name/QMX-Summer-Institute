package com.qmx.work1;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //构造Scanner类对象
        MaxPublicCount Max = new MaxPublicCount();
        System.out.print("请输入x的值:");
        int x = s.nextInt();
        System.out.print("请输入y的值:");
        int y = s.nextInt();
        int a = Max.Fun(x, y);
        System.out.print("x,y的最大公约数为");
        System.out.println(a);

        MinPublicCount Min = new MinPublicCount();
        int b = Min.Fun(x, y);
        System.out.print("x,y的最小公倍数数为");
        System.out.println(b);

    }
}
