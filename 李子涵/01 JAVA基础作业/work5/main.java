package com.qmx.work5;

public class main {
    public static void main(String[] args) {
        int a, b, c;
        Slove s = new Slove();
        try{
        s.method("312312312",1321);
        s.method("312312312","1321");
        s.method(321,1321);
    }catch(Error e){
            Object index = new Object();
            Object str = new Object();
            if(index instanceof String){
                System.out.println("0");
            }
            else if(str instanceof Integer){
                System.out.println("1");
            }
        }finally{
            System.out.println("2");
        }

        }
}
