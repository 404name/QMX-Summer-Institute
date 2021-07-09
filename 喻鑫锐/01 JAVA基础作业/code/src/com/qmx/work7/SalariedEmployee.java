package com.qmx.work7;

public abstract class SalariedEmployee extends Employee {

    private double monthlySalary;

    @Override
    public double earnings() {
        return this.monthlySalary;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "type= SalariedEmployee" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
