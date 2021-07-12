package com.qmx.work4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayList {

    public static void main(String[] args) {
        //一维数组
        int[] ArrayList1 = new int[5];
        Scanner input = new Scanner(System.in);//输入
        //int[] ArrayList = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < ArrayList1.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据");
            ArrayList1[i] = input.nextInt();
        }

        for (int i = 0; i < ArrayList1.length; i++) {
            System.out.println("第" + (i + 1) + "个元素值为：" + ArrayList1[i]);
        }

        for (int val : ArrayList1) {
            System.out.println("元素的值依次是：" + val);
        }

        System.out.println(Arrays.toString(ArrayList1));
        //Arrays.toString(一维数组名)

        //二维数组

        int[][] ArrayList2 = new int[5][5];
        for (int i = 0; i < ArrayList2.length; i++) {
            for (int j = 0; j < ArrayList2[i].length; j++) {
                ArrayList2[i][j] = (int) (Math.random() * 10);
            }

        }

        for (int[] row : ArrayList2) {
            for (int value : row) {//注意后面是row

                System.out.println("元素的值依次是：" + value);

            }
        }
        System.out.println(Arrays.deepToString(ArrayList2));//快速打印二维数组的数据元素列表
        //Arrays.deepToString(二维数组名)
    }
}