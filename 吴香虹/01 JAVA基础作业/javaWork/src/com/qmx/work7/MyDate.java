package com.qmx.work7;

import java.security.PublicKey;

public class MyDate {
    private String year, mouth, day;
    public MyDate(String year, String mouth, String day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }
    public String toDateString() {
        return year + "年" + mouth + "月" + day + "日";
    }
}
