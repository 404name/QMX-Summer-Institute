package com.qmx.work7;

public class HourlyEmployee extends Employee {
    private int wage, hour;

    public HourlyEmployee(String name, String number, int year, int month, int day, int wage, int hour) {
        super(name, number, year, month, day);//调用父类构造器
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public void to_string() {
        System.out.println("员工类型:钟点工");
        super.to_string();
    }

    @Override
    public int earnings() {
        return wage*hour;
    }
}
