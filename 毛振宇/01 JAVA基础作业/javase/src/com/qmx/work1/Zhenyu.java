package com.qmx.work1;

import java.util.Scanner;

class father {
    public int f(int a, int b){
        int x = a % b;
        while(x > 0){
            a = b;
            b = x;
            x = a % b;
        }
        return b;
    }
}

class son extends father{
    public int f(int a, int b){
        int x = super.f(a,b);
        return a * b / x;
    }
}

public class Zhenyu {
    public static void main(String[] args) {
        System.out.println("输入a,b的值");
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        father fa = new father();
        son so = new son();
        System.out.println("最大公约数为："+fa.f(a,b));
        System.out.println("最小公倍数为："+so.f(a,b));
    }
}
