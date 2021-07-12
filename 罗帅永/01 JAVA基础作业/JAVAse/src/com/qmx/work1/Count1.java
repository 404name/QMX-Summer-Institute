package com.qmx.work1;

public class Count1 {
    public static void main(String[] args)
    {
        Gcd gcd=new Gcd();
        int result1=gcd.f(81,7788);
        System.out.println(result1);
        Lcm lcm=new Lcm();
        int result2=lcm.f(81,7788);
        System.out.println(result2);
    }
}
