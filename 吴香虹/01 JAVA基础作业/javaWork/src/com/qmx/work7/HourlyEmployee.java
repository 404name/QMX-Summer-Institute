package com.qmx.work7;

public class HourlyEmployee extends Employee{
    private int wage;
    private int hour;

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        wage = wage;
        hour = hour;
    }
    @Override
    public int earnings() {
        return wage * hour;
    }
}
