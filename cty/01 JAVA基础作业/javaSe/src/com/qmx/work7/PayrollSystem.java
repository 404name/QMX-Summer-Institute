package com.qmx.work7;

public class PayrollSystem {
    public void show(){
        Employee[] employee = new SalariedEmployee[10];
        employee[0] = new SalariedEmployee(1000, "CTY1", 1,new MyDate("2001", "12","17"));
        employee[1] = new SalariedEmployee(1000, "CTY2", 1,new MyDate("2001", "12","17"));
        employee[2] = new SalariedEmployee(1000, "CTY3", 1,new MyDate("2001", "12","17"));
        employee[3] = new SalariedEmployee(1000, "CTY4", 1,new MyDate("2001", "12","17"));
        employee[4] = new SalariedEmployee(1000, "CTY5", 1,new MyDate("2001", "12","17"));
        employee[5] = new SalariedEmployee(1000, "CTY6", 1,new MyDate("2001", "12","17"));
        employee[6] = new SalariedEmployee(1000, "CTY7", 1,new MyDate("2001", "12","17"));
        employee[7] = new SalariedEmployee(1000, "CTY8", 1,new MyDate("2001", "12","17"));
        employee[8] = new SalariedEmployee(1000, "CTY9", 1,new MyDate("2001", "12","17"));
        employee[9] = new SalariedEmployee(1000, "CTY10", 1,new MyDate("2001", "12","17"));
        for(Employee e : employee){
            System.out.println(e.toString());
        }
    }
}
