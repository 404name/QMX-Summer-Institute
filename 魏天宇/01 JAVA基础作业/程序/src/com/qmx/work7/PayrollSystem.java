package com.qmx.work7;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees[0] = new SalariedEmployee("WTY1", 1,2002,2,22, 20000);
        employees[1] = new SalariedEmployee("WTY2", 2,2002,4,22, 30000);
        employees[2] = new SalariedEmployee("WTY3", 3,2002,6,22, 40000);
        employees[3] = new SalariedEmployee("WTY4", 4,2002,8,22, 50000);
        employees[4] = new SalariedEmployee("WTY5", 8,2002,10,22, 60000);
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].toString());
            if(employees[i].getMonth() == 2){
                System.out.println("本月是" + employees[i].getName() + "的生日。");
                System.out.println(employees[i].getName() + "本月获得额外津贴800￥");
            }
        }
    }
}
