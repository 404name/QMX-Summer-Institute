package com.qmx.work1;

import java.util.Scanner;

public class work1 {
    public static int a;
    public static int b;
    public static int YS;

    public int func1(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public void solve(){
            System.out.println("请输入需要求最大公约数的两个数字:");
            Scanner s = new Scanner(System.in);
            if (s.hasNext()){
                a = s.nextInt();
                b = s.nextInt();
            }
            s.close();
            System.out.println(a + "和" + b + "的最大公约数为:");
            YS = func1(a,b);
            System.out.println(YS);
        }
}







