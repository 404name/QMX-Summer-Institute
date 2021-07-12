package com.qmx.work1;

public class Lcm extends Gcd
{
    public int f(int a,int b)
    {
        Gcd gcd=new Gcd();
        int m=gcd.f(a,b);
        int result=a*b/m;
        return result;
    }
}