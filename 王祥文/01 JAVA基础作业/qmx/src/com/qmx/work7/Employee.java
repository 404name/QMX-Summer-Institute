package com.qmx.work7;

public abstract  class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(String name, int number, int year, int month, int day) {
        birthday = new MyDate(year,month,day);
        this.name = name;
        this.number = number;
    }

    public abstract double earnings();

    public String toString() {
        return "姓名:" + name + "id:" + number + "生日：" + birthday.toDateString();
    }

    public  int getMonth(){
        return this.birthday.getMonth();
    }

    public String getName(){
        return this.name;
    }
}
