package com.qmx.work4;

import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Array {

    public static void main(String[] args) {
        ArrayList  List = new ArrayList();
        for (int i = 0; i < 10; i++) {
            List.add(i);
        }
        List.remove(5);
        Iterator it1 = List.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        for (Iterator it2 = List.iterator();it2.hasNext();) {
            System.out.println(it2.next());
        }
        for (Object i:List) {
            System.out.println(i);
        }
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }
    }
}