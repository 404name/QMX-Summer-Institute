package com.qmx.work4;

import java.util.ArrayList;

public class Solution1 {
    // for循环
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("WTY");
        list.add("NEVER");
        list.add("GIVE");
        list.add("UP");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " ");
        }
    }
}
