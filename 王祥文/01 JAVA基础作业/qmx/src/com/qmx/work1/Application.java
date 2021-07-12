package com.qmx.work1;

public class Application {

    public static void main(String[] args) {

        Gcd oneFun = new Gcd();
        int gc = oneFun.f(2,3);
        System.out.println("最大公约数："+gc);

        Lcm twoFun = new Lcm();
        int lc = twoFun.f(2,3);
        System.out.println("最小公倍数："+lc);
    }
}
