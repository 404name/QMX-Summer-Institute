package com.qmx.work1;

public class Cty {
    public int f(int a, int b){
        if(a > b){
            int t = a % b;
            return t == 0 ? b : f(b, t);
        }else{
            int t = b % a;
            return t == 0 ? a : f(a, t);
        }
    }
}
