package com.qmx.work5;

public class ErrorAble {
    public static void main(String[] args) {
        ErrorAble errorAble = new ErrorAble();
        System.out.println(errorAble.method("123",123));
    }

    public int method(String str, int index) {
        try {
            System.out.println(".");
        } catch (StringIndexOutOfBoundsException b) {
            return 1;
        } catch (IndexOutOfBoundsException a) {
            return 0;
        }
        return 2;
    }

}
