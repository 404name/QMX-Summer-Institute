package com.qmx.work7;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;
    public abstract double earnings();
    public Employee(String name,int number,int year,int month,int day){
        birthday = new MyDate(year,month,day);
        this.name = name;
        this.number = number;
    }
    public int getMonth(){
        return this.birthday.getMonth();
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "姓名： " + name + "    编号： " + number +  "     生日： " + birthday.toDateString();
    }
}
