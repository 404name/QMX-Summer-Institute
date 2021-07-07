package com.qmx.work5;

public class Application {
    public static int method(String str, int index){
        try {
            System.out.println("这我不知道咋测试");
        }catch (StringIndexOutOfBoundsException e){
            return 0;
        }catch (IndexOutOfBoundsException e) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        System.out.println(method("??", 000));
    }
}
