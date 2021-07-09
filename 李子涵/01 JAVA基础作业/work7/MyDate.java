package com.qmx.work7;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(int y,int m,int d){
        year = y;
        month = m;
        day = d;
    }
    public void setall(int y,int m,int d ){
        year = y;
        month = m;
        day = d;
    }
    public int getMonth(){
        return month;
    }
    public String toDateString(){
        String birth;
        birth = year + "年" + month + "月" + day + "日";
        return birth;
    }

}
