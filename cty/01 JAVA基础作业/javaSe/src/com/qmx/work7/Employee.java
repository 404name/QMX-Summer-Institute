package com.qmx.work7;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    abstract int earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toString() +
                '}';
    }
}
