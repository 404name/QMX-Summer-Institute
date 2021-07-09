package com.qmx.work1;

public class MaxPublicCount {
    public int Fun(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}

