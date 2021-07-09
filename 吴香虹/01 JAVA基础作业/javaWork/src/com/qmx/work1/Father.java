package com.qmx.work1;

public class Father{
    public int f(int a, int b) {
        while(b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
