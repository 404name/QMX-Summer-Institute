package com.qmx.work7;

public class SalariedEmployee extends Employee{
    private double monthlySalary;
    public SalariedEmployee(String name, int number,int year,int month,int day,double monthlySalary) {
        super(name, number,year,month,day);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double earnings(){
        return monthlySalary;
    }
    public String toString(String name, double number, MyDate birthday){
        return "姓名： " + name + "编号： " + number +  "生日： " + birthday.toDateString();
    }
}
