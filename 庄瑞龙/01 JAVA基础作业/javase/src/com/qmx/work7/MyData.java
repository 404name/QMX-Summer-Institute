package com.qmx.work7;

public class MyData {
    private int year, month, day;

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }
}
