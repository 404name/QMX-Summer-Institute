package com.qmx.work1;

public class Application {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        CalcGCD calcGCD = new CalcGCD();
        CalcLCM calcLCM = new CalcLCM();
        System.out.println(a + "和" + b + "的最大公约数为:" + calcGCD.func(a,b));
        System.out.println(a + "和" + b + "的最小公倍数为:" + calcLCM.func(a,b));
    }
}
