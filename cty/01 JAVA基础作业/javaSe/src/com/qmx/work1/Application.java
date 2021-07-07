package com.qmx.work1;

public class Application {
    public static void main(String[] args) {
        Cty cty = new Cty();
        CtyA ctyA = new CtyA();
        System.out.println(cty.f(10, 20));
        System.out.println(ctyA.f(10, 20));
    }
}
