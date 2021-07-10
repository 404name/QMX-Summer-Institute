package com.qmx.work7;

public class HourlyEmployee extends Employee{
    private double wage,hour;
    public HourlyEmployee(String name,int number,Mydate birthday,double wage,double hour){
        super(name,number,birthday);
        this.wage = wage;
        this.hour = hour;
    }
    @Override
    double earnings() {
        return wage*hour;
    }
    public String toString(){
        return "HourlyEmployee "+super.toString();
    }
}