package com.qmx.work1;

public class Main {
    public static void main(String[] args) {
        GongYue a = new GongYue();
        System.out.println("最大公约数为：" + a.f(4, 6));
        GongBei b = new GongBei();
        System.out.println("最小公倍数为：" + b.f(4, 6));
    }
}
