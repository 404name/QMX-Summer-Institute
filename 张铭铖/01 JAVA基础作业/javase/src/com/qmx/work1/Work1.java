package com.qmx.work1;

public class Work1 {
    private int a, b;
    public Work1() {
    }
    public Work1(int A, int B) {
        a = A;
        b = B;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int f() {
        int min = Math.min(a, b);
        while (true) {
            if (a % min == 0 && b % min == 0) {
                return min;
            }
            min--;
        }
    }
}

