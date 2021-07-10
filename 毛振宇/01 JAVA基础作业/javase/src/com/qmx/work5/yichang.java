package com.qmx.work5;

import java.lang.reflect.Method;

public class yichang {
    public static int methof(String str,int index){
        if (str == "0")
            throw new StringIndexOutOfBoundsException("1");
        if (index == 0)
            throw new IndexOutOfBoundsException("0");
        return 0;
    }

    public static void main(String[] args) {
        int a = methof("q",0);
        System.out.println(a);
    }
}