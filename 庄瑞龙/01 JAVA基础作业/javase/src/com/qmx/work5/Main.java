package com.qmx.work5;

public class Main {
    static int method(String str, int index){
        try{
            System.out.println(str);
        } catch (Exception e) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {



        String[] array1 = {"China", "hubei", "yichang"};
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println(array1[4]);
    }

}
