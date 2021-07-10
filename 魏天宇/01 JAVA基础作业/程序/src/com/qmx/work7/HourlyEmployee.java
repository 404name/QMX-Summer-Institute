package com.qmx.work7;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    public HourlyEmployee(String name, int number,int year,int month,int day,double wage,double hour) {
        super(name, number, year,month,day);
        this.wage=wage;
        this.hour=hour;

    }

    @Override
    public double earnings() {
        return wage * hour;
    }
    public String toString(String name, double number, MyDate birthday){
        return "姓名： " + name + "编号： " + number +  "生日： " + birthday.toDateString();
    }
}
