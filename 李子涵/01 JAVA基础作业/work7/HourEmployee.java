package com.qmx.work7;

public class HourEmployee extends Employee{
        private String name;
        private int number;
        private MyDate birthday;
        private int HourlySalary;

        public HourEmployee(String na, int num, MyDate bir, int hs ){
            name = na;
            number = num;
            birthday = bir;
            HourlySalary = hs;
        }

        public int earnings() {
            return HourlySalary;
        }

        @Override
        public String toString() {
            String ins;
            if(today.getMonth() != birthday.getMonth())
                ins = "此员工类型为HourEmployee类型" + "   " + "其为时结薪水模式,其时工资为:" + earnings() + "   " + "此员工姓名为:" + name + "   " + "此员工编号为:" + number + "   " + "此员工生日为:" + birthday.toDateString();
            else
                ins = "此员工类型为HourEmployee类型" + "   " + "其为时结薪水模式,其时工资为:" + earnings() + "+100(本月有该名员工生日)" +"   " + "此员工姓名为:" + name + "   " + "此员工编号为:" + number + "   " + "此员工生日为:" + birthday.toDateString();
            return ins;
        }
}
