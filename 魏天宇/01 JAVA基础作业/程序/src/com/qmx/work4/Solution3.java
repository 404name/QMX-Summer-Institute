package com.qmx.work4;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution3 {
    //迭代器
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("WTY");
        list.add("NEVER");
        list.add("GIVE");
        list.add("UP");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
