package com.qmx.work1;

public class CalcGCD {
    public int func(int a,int b){
        int res = 0;
        while(b != 0){
            res = a % b;
            a = b;
            b = res;
        }
        return a;
    }
}
