package com.qmx.work4;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> cty = new ArrayList<>();
        cty.add("cty");
        cty.add("and");
        cty.add("ali");
        cty.add("the fox");
        for(int i = 0 ; i < cty.size(); i++){
            System.out.println(cty.get(i));
        }
        for (String s : cty) {
            System.out.println(s);
        }
        Iterator<String> it = cty.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
