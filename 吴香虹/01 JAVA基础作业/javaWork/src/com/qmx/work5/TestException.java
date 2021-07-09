package com.qmx.work5;

public class TestException {
    public int method(String str,int index) {
        if(index > str.length()) {
            throw new IndexOutOfBoundsException("0"); //抛出一个运行时异常
        } else if(index == str.length()) {
            throw new StringIndexOutOfBoundsException("1"); //抛出一个运行时异常
        }
        return 2;
    }

    public static void main(String[] args) {
        TestException test = new TestException();
//        System.out.println(test.method("sd", 3));
        System.out.println(test.method("sd", 2));
    }
}
