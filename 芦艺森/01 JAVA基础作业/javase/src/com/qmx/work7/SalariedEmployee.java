package com.qmx.work7;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, int number, int year, int month, int day, double monthlySalary) {
        super(name, number, year, month, day);
        this.monthlySalary = monthlySalary;
    }

    public String ToString() {
        return "职位:" + "SalariedEmployee\n" + super.ToString();
    }
}
