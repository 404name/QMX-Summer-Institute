package com.qmx.work7;

public class SalariedEmployee extends Employee{
    private  int  mouthlySalary;
    public SalariedEmployee(String name, int number, MyDate birthday, int mouthlySalary) {
        super(name, number, birthday);
        this.mouthlySalary = mouthlySalary;
    }
    @Override
    public int earnings() {
        return mouthlySalary;
    }


    public String toString(String name, int number, MyDate birthday) {
        return "员工" + name + "工号为" + number + "生日为" + birthday.toDateString();
    }

}
