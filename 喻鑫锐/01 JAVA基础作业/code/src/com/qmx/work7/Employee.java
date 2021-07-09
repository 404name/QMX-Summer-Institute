package com.qmx.work7;

public abstract class Employee {
    public String name;
    public String number;
    public MyDate birthday;
    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
