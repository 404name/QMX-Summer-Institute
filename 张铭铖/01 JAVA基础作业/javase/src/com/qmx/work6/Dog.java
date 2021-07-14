package com.qmx.work6;

public class Dog implements Animal {//接口类,关键词implements
    @Override
    public String cry() {
        return "汪汪汪~";
    }

    @Override
    public String getAnimalName() {
        return "狗";
    }
}
