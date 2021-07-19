package com.qmx.work1;

public class Lcm extends Gcd{

    @Override
    public int f(int a, int b) {
        int mc =  super.f(a, b);
        int rc = a * b / mc;
        return rc;
    }
}
