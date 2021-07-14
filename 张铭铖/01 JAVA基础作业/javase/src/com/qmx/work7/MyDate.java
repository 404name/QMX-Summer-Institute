package com.qmx.work7;

public class MyDate {
    private int year, month, day;

    public MyDate( int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toDateString(){
        return year+"年"+month+"月"+day+"日";
    }
}
