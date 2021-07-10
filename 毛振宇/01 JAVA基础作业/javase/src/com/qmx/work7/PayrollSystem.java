package com.qmx.work7;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee list[] = new Employee[3];
        list[0] = new HourlyEmployee("庄瑞龙",1111,new Mydate(2000,05,12),100,100);
        list[1] = new SalariedEmployee("毛振宇",2222,new Mydate(2002,07,16),100000);
        System.out.println("本月为7月");
        for (int i = 0; i < 2; i++) {
            if(list[i].getmonth() == 7)
                System.out.println(list[i].toString()+" 工资+100 "+(list[i].earnings()+100));
            else System.out.println(list[i].toString()+list[i].earnings());
        }
    }
}