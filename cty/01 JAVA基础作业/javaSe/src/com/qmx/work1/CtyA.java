package com.qmx.work1;

public class CtyA extends Cty {
    @Override
    public int f(int a, int b) {
        int k = super.f(a, b);
        System.out.println("最大公因数" + k);
        return a * b / k;
    }
}
