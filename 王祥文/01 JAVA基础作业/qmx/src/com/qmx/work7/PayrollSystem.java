package com.qmx.work7;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employee = new Employee[2];

        employee[0] = new SalariedEmployee("孙悟空", 1,2002,7,21, 20000);
        employee[1] = new SalariedEmployee("猪八戒", 2,2002,7,22, 10000);

        for(int i = 0; i < employee.length; i++){

            System.out.println(employee[i].toString());

            if(employee[i].getMonth() == 2){
                System.out.println("本月是" + employee[i].getName() + "的生日。");
                System.out.println(employee[i].getName() + "本月获得额外津贴800￥");
            }
        }
    }
}
