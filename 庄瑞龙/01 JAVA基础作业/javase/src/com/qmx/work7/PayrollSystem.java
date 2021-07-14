package com.qmx.work7;
import java.util.Scanner;
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] arr = new Employee[2];
        arr[0] = new SalariedEmployee("zhang", 1990, 6, 1, 10, 2000);
        arr[1] = new HourlyEmployee("wang", 1989, 4, 5, 11, 200, 12);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入本月月份：");
        int month = input.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].birthday.getMonth() == month) {//判断本月有没有人生日
            System.out.println(arr[i]);
            System.out.println("实际工资：" + (arr[i].earnings() + 100));
        }else {
            System.out.println(arr[i]);
            System.out.println("实际工资：" + arr[i].earnings());
        }

        }
    }
}

