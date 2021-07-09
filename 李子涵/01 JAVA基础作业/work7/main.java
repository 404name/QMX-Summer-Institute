package com.qmx.work7;

public class main {
    public static void main(String[] args) {
        MyDate today = new MyDate(2021,7,9);
        Employee.today = today;

        MyDate e1_bir = new MyDate(2001,11,30);
        SalariedEmployee e1 = new SalariedEmployee("张三",2021,e1_bir, 10000);

        MyDate e2_bir = new MyDate(2000,7,9);
        HourEmployee e2 = new HourEmployee("李四",21231,e2_bir, 100);

        PayrollSystem p = new PayrollSystem(e1);
        p.addP(e2);
        p.showArrays();
    }
}
