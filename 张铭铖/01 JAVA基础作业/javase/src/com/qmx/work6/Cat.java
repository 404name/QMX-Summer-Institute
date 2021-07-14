package com.qmx.work6;

public class Cat implements Animal {//接口类,关键词implements
    @Override
    public String getAnimalName() {
        return "猫";
    }

    @Override
    public String cry() {
        return "喵喵喵~";
    }
}
