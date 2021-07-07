package com.qmx.work7;

import java.util.Calendar;

public class SalariedEmployee extends Employee {
    private int monthlySalary;
    private String name;
    private int number;
    private MyDate birthday;

    public SalariedEmployee(int monthlySalary, String name, int number, MyDate birthday) {
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    @Override
    int earnings() {
        Calendar rightNow = Calendar.getInstance();
        String month = "" + (rightNow.get(Calendar.MONTH)+1);
        if(month.equals(birthday.getMonth())){
            return monthlySalary + 100;
        }else{
            return monthlySalary;
        }
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toString() +
                '}';
    }
}
