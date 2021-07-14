package com.qmx.work1;

public class Work1_son extends Work1 {//extends,继承关键词
    public Work1_son(int A, int B) {
        super(A, B);
    }
    @Override
    public int f() {
        System.out.println("最大公约数:"+super.f());
        return super.getA()*super.getB()/super.f();
    }
}
