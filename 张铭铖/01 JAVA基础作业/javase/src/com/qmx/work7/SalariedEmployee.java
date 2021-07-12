package com.qmx.work7;

public class SalariedEmployee extends Employee {
    private int monthlySalary;

    public SalariedEmployee(String name, String number, int year, int month, int day, int monthlySalary) {
        super(name, number, year, month, day);//调用父类构造器
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void to_string() {
        System.out.println("员工类型:月工");
        super.to_string();
    }

    @Override
    public int earnings() {
        return monthlySalary;
    }
}
