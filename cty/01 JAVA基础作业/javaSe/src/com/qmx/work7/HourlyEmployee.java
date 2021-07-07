package com.qmx.work7;

public class HourlyEmployee extends Employee {
    private int wage, hour;
    private String name;
    private int number;
    private MyDate birthday;

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toString() +
                '}';
    }

    @Override
    int earnings() {
        return wage * hour;
    }
}
