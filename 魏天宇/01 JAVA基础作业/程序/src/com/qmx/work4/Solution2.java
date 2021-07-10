package com.qmx.work4;

import java.util.ArrayList;

public class Solution2 {
    //增强for循环 foreach
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("WTY");
        list.add("NEVER");
        list.add("GIVE");
        list.add("UP");
        for(Object object : list){
            System.out.println(object + " ");
        }
    }
}
