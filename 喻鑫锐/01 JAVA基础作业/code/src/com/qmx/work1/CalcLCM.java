package com.qmx.work1;

public class CalcLCM extends CalcGCD{
    @Override
    public int func(int a, int b) {
        int temp = a * b;
        return temp / super.func(a,b);
    }
}
