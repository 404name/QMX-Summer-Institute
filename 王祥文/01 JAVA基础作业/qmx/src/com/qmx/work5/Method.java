package com.qmx.work5;

public class Method {
    public static int method(String str, int index){
        if(str == "0")
        {
            throw new IndexOutOfBoundsException("1");
        }
        else if(index == 0)
        {
            throw new IndexOutOfBoundsException("0");
        }
        return 2;
    }

    public static void main(String[] args) {
        Method one = new Method();
        int c = one.method("str",9);
        System.out.println(c);
    }
}
