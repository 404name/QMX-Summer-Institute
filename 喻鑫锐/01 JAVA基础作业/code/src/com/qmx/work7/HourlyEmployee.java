package com.qmx.work7;

public abstract class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    @Override
    public double earnings() {
        return this.wage * this.hour;
    }



    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "type= HourlyEmployee" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
