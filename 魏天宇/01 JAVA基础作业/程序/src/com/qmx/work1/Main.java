package com.qmx.work1;

public class Main {
    public static void main(String[] args) {
        int a = 36;
        int b = 48;
        Zdgys zdgys = new Zdgys();
        Zxgbs zxgbs = new Zxgbs();
        System.out.println(a + "和" + b + "的最大公约数为:" + zdgys.f(a,b));
        System.out.println(a + "和" + b + "的最小倍数数为:" + zxgbs.f(a,b));
    }
}
