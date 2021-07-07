package com.qmx.work1;

import java.util.Scanner;

public class work1son extends work1 {
          public static int BS;
         public void solve(int choice){
             System.out.println("请输入需要求最小公倍数的两个数字");
             Scanner s = new Scanner(System.in);
             if (s.hasNext()){
                 a = s.nextInt();
                 b = s.nextInt();
             }
             s.close();
             System.out.println(a + "和" + b + "的最小公倍数为:");
             BS = (a * b )/ func1(a,b);
             System.out.println(BS);
    }
}
