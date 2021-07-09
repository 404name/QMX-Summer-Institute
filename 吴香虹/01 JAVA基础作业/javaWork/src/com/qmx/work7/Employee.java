package com.qmx.work7;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }
    public abstract int earnings();

    public String toString() {
        return "员工" + name + "工号为" + number + "生日为" + birthday.toDateString();
    }
}
