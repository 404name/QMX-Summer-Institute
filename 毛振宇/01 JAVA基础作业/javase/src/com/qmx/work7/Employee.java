package com.qmx.work7;

public abstract class Employee {
    private String name;
    private int number;
    private Mydate birthday;
    public Employee(String name,int number,Mydate birthday){
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }
    public int getmonth(){
        return birthday.getMonth();
    }
    abstract double earnings();
    public String toString(){
        return "name：" + name + ", number：" + number + ", birthday：" + birthday.toDateString();
    }
}