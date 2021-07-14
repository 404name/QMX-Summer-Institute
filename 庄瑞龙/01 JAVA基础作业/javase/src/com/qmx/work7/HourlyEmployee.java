package com.qmx.work7;

public class HourlyEmployee extends Employee{
    private double wage, hour;

    public HourlyEmployee(String name,int year, int month, int day, int number, double wage, double hour) {
        super(name, number, year, month, day);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    double earnings() {

        return wage * hour;
    }
    public String toString(){
        return super.toString() + " 时薪：" + wage + "工作了" + hour + "个小时";
    }
}