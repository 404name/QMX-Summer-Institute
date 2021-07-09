package com.qmx.work7;

public class PayrollSystem {
    public void show() {
        Employee []employees = new SalariedEmployee[5];
        employees[0] = new SalariedEmployee("xiaoming", 1, new MyDate("2002", "1", "5"), 10000);
        employees[1] = new SalariedEmployee("xiaohong", 2, new MyDate("2002", "1", "5"), 15000);
        employees[2] = new SalariedEmployee("xiaohei", 3, new MyDate("2002", "1", "5"), 12000);
        employees[3] = new SalariedEmployee("xiaojun", 4, new MyDate("2002", "1", "5"), 20000);
        employees[4] = new SalariedEmployee("xiaoxia", 5, new MyDate("2002", "1", "5"), 50000);
        for(Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
