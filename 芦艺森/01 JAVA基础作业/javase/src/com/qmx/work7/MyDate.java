package com.qmx.work7;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public void MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString() {
        String s;
        s = year + "年" + month + "月" + day + "日";
        return s;
    }

    public int getMonth() {
        return month;
    }
}
