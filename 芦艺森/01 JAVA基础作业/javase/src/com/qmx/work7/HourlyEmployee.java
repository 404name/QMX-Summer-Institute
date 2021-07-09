package com.qmx.work7;

public class HourlyEmployee extends Employee {
    private double wage;
    private int hour;

    public HourlyEmployee(String name, int number, int year, int month, int day, double wage, int hour) {
        super(name, number, year, month, day);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    public String ToString() {
        return "职位:" + "HourlyEmployee\n" + super.ToString();
    }

}
