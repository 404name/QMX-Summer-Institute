package com.qmx.work5;

public class Way {
    public int method(String str,int index){
        try {
            char a = str.charAt(index);
        } catch (StringIndexOutOfBoundsException w) {
            return 1;
        } catch (IndexOutOfBoundsException w) {
            return 0;
        }
        return 2;
    }
}
