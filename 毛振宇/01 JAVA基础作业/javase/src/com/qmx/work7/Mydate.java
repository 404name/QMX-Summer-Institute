package com.qmx.work7;

public class Mydate {
    private int year,month,day;
    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getMonth(){
        return month;
    }
    public String toDateString(){
        return year+"年"+month+"月"+day+"日";
    }

}