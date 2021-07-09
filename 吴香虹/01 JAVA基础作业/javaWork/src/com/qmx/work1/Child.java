package com.qmx.work1;

public class Child extends Father{
    public int f(int a, int b) {
        //子类重写父类的方法
        int gcd = super.f(a, b);
        return (a * b) / gcd;
    }
}
