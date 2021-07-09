package com.qmx.work7;

import java.util.Scanner;

public abstract class Employee {   //父类雇员
    private String name;   //姓名
    private int number;    //编号
    private MyDate birthday = new MyDate();  //生日

    public Employee(String name, int number, int year, int month, int day) {
        this.name = name;
        this.number = number;
        birthday.MyDate(year, month, day);
    }

    public abstract double earnings();

    public String ToString() {
        return "姓名:" + name + '\n' + "编号:" + number + '\n' + "生日:" + birthday.toDateString();
    }

    public int getMonth() {
        return birthday.getMonth();
    }

    public String getName() {
        return name;
    }
}
