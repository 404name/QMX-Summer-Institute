package com.qmx.work7;

public class SalariedEmployee extends Employee{
    private double monthlySalary;
    public SalariedEmployee(String name,int number,Mydate birthday,double monthlySalary){
        super(name,number,birthday);
        this.monthlySalary = monthlySalary;
    }
    @Override
    double earnings() {
        return monthlySalary;
    }
    public String toString(){
        return "SalariedEmployee "+super.toString();
    }
}