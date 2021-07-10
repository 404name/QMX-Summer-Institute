package com.qmx.work4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Solution4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("WTY");
        list.add("NEVER");
        list.add("GIVE");
        list.add("UP");
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){//正向
            System.out.println(listIterator.next() + " ");
        }
        while(listIterator.hasPrevious()){//逆向
            System.out.println(listIterator.previous() + " ");
        }
    }
}
