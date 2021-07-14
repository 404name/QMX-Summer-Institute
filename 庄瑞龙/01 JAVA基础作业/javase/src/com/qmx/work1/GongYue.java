package com.qmx.work1;

public class GongYue {
    public int f(int a, int b)
    {
        int max, min, temp;
        if(a > b)
        {
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        if((temp = max % min ) != 0)
        {
            max = min ;
            min = temp;
        }
        return min;
    }


}


