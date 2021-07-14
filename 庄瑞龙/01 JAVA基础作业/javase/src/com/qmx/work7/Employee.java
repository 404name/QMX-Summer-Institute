package com.qmx.work7;

import java.util.Date;

public abstract class Employee {
    private String name;
    public MyData birthday;
    private int number;
    public Employee(String name, int number, int year, int month, int day){
        this.name = name;
        this.birthday = new MyData(year, month, day);
        this.number = number;
    }
    abstract double earnings();
    public String toString(){
        return name + " " + number + " " + birthday.toDateString();
    }


}
