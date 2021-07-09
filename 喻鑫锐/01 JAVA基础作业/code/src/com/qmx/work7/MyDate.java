package com.qmx.work7;

public class MyDate {
    public int year;
    public int month;
    public int day;

    public String toDateString(){
        String str = "";
        str += (this.year + "年");
        str += (this.month + "月");
        str += (this.day + "日");
        return str;
    }
}
