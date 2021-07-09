package com.qmx.work4;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("yxr");
        arr.add("qmx");
        arr.add("CTGU");

        // for循环遍历
        System.out.println("for循环遍历");
        for(int i = 0;i < arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println();


        // 增强for循环
        System.out.println("增强for循环");
        for(String str : arr){
            System.out.println(str);
        }
        System.out.println();

        // 迭代器
        System.out.println("迭代器");
        Iterator<String> iterator = arr.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println();

        // 迭代器
        System.out.println("迭代器");
        arr.forEach(System.out::println);
    }
}
