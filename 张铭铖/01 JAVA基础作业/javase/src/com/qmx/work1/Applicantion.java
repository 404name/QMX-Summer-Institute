package com.qmx.work1;

public class Applicantion {
    public static void main(String[] args) {
        Work1 obj1 = new Work1(125,75);
        System.out.println("最大公约数:"+obj1.f());
        Work1_son obj2 = new Work1_son(125,75);
        System.out.println("最小公倍数:"+obj2.f());
    }
}

