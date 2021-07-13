package com.qmx.work4;

public class Array {
    public static void main(String[] args) {
        int[] num = new int[10];
        //int num = {1,3,4,7}
        int nums = 0,i;
        //第一种 for循环
        for(i = 0;i < num.length;i++)
        {
            num[i] = i;
            nums+=num[i];
        }
        System.out.println(nums);
        //第二种 for-each
        nums = 0;
        for (int item : num) {
            nums+=item;
        }
        System.out.println(nums);
        //第三种 while循环
        i=0;
        nums = 0;
        while(i<=9){
            nums+=num[i];
            i++;
        }
        System.out.println(nums);
    }
}
