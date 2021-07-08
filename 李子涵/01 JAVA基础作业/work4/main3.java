package com.qmx.work4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class main3 {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>();
               name.add("zhangsan");
               name.add("lisi");
               name.add("wangwu");
               name.add("zhaoliu");
        Iterator<String> it=name.iterator();
                while(it.hasNext()){
                         System.out.println(it.next());
                    }

    }
}
