package com.qmx.work7;

import com.sun.javaws.IconUtil;
import java.io.SequenceInputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("张三","001",2001,1,1,10000);
        employees[1] = new SalariedEmployee("李四","002",2002,2,2,10000);
        employees[2] = new HourlyEmployee("王五","003",2003,3,3,100,100);
        employees[3] = new HourlyEmployee("赵六","004",2004,4,4,100,100);
        int month = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入当前月:");
        if(scanner.hasNextInt()){
            month = scanner.nextInt();
        }
        for(int i=0;i<employees.length;i++){
            employees[i].to_string();//打印员工基本信息
            if(employees[i].getBirthdayMonth()==month){
                System.out.println(month+"月工资为:"+(employees[i].earnings()+100));
            }
            else{
                System.out.println(month+"月工资为:"+employees[i].earnings());
            }
            System.out.println("============================");
        }
        scanner.close();
    }
}