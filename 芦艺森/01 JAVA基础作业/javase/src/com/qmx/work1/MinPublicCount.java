package com.qmx.work1;

public class MinPublicCount extends MaxPublicCount {
    public int Fun(int a, int b) {
        return a * b / super.Fun(a, b);
    }
}

