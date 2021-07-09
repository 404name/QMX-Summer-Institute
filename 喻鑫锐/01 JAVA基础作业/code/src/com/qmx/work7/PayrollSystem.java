package com.qmx.work7;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        int nowMonth = 7;
        employees[0].birthday.day = 16;
        employees[0].birthday.month = 6;
        employees[0].birthday.year = 2002;
        employees[0].name = "yxr";
        employees[0].number = "2020112617";

        employees[1].birthday.day = 18;
        employees[1].birthday.month = 4;
        employees[1].birthday.year = 2003;
        employees[1].name = "zyl";
        employees[1].number = "2020112616";

        for(int i = 0;i < employees.length;i++){
            System.out.println(employees[i].toString());
            if(employees[i].birthday.month == nowMonth){
                System.out.println("本月是" + employees[i] + "的生日");
                System.out.println(employees[i] + "本月工资增加100元");

            }
        }
    }
}
