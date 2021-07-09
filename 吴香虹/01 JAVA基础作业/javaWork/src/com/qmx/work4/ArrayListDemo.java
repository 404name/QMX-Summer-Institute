package com.qmx.work4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("abcdef");
        //for循环遍历
        for(int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }
        //for each遍历
        for(String elem : list) {
            System.out.println(elem);
        }
        //   Iterator的遍历方式
        for(Iterator<String> elem = list.iterator(); elem.hasNext();) {
            System.out.print(elem.next());
        }
    }
}
