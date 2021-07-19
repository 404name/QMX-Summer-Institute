package com.qmx.work1;

public class Gcd {

    public int f(int a,int b){
        if(a%b==0)
        {
            return b;
        }
        else {
            return f(a,a%b);
        }
    }
}
