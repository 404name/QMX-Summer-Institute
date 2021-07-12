package com.qmx.work1;

public class Gcd
{
    public int f(int a,int b)
    {
        int i,m;
        if(a<b)
        {
            m=a;
            a=b;
            b=m;
        }
        while(b>0)
        {
            if(a==b)
                return a;
            else
            {
                m=a%b;
                a=b;
                b=m;
            }
        }
        return a;
    }
}
