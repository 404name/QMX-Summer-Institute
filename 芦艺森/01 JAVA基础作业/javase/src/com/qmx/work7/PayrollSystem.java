package com.qmx.work7;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee employee[] = new Employee[4];
        employee[0] = new SalariedEmployee("张三", 001, 2000, 10, 1, 20000);
        employee[1] = new HourlyEmployee("李四", 002, 2001, 6, 1, 120, 8);
        employee[2] = new HourlyEmployee("张五", 003, 1990, 5, 1, 200, 12);
        employee[3] = new SalariedEmployee("李六", 004, 2002, 11, 22, 500000);
        for (int i = 0; i < 4; i++) {
            System.out.println(employee[i].ToString());
            System.out.print("工资:");
            System.out.println(employee[i].earnings());
            System.out.println();
        }
        System.out.print("请输入月份:");
        int month = s.nextInt();
        for (int i = 0; i < 4; i++) {
            if (employee[i].getMonth() == month) {
                System.out.print(employee[i].getName());
                System.out.println("过生日其工资增加100,增加后其实际工资为");
                System.out.println(employee[i].earnings()+100);
            }
        }
    }
}
