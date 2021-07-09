package com.qmx.work7;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;
    public static MyDate today;
    public String getname() {
        return name;
    }
    public int getnumber(){
        return number;
    }
    public MyDate getbirthday(){
        return birthday;
    }
    public abstract int earnings();
    public abstract String toString();
}
