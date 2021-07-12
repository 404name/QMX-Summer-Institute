package com.qmx.work7;

public abstract class Employee {//抽象类
    protected String name, number;
    protected MyDate birthday;//类的组合

    public Employee(String name, String number, int year, int month, int day) {
        birthday = new MyDate(year, month, day);//调用组合类的构造器
        this.name = name;
        this.number = number;
    }

    public int getBirthdayMonth() {
        return birthday.getMonth();
    }

    public void to_string(){
        System.out.println("员工姓名:"+name);
        System.out.println("员工工号:"+number);
        System.out.println("员工生日:"+birthday.toDateString());
    }

    public abstract int earnings();//抽象方法
}
