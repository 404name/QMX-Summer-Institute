package com.qmx.work1;

import com.sun.javaws.IconUtil;

public class Zdgys {
    public static int f(int a, int b){
        int t = a;
        if(a < b){
            a = b;
            b = t;
        }
        while(a % b != 0){
            t = a % b;
            a = b;
            b = t;
        }
        return b;
    }
}
