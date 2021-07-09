package com.qmx.work1;

public class MainClass {
    public static void main(String[] args) {
        Father father = new Father();
        Child child = new Child();
        int gcd = father.f(20,10);
        int lmc = child.f(3,8);
        System.out.println(gcd);
        System.out.println(lmc);
    }
}
