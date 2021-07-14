package com.qmx.work7;

public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(String name,int year, int month, int day, int number, double monthlySalary) {
        super(name, number, year, month, day);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double earnings() {
        return monthlySalary;
    }
    public String toString(){
      return super.toString() + " 月薪：" + monthlySalary;
    }
}
