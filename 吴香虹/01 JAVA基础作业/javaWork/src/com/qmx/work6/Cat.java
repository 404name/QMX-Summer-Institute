package com.qmx.work6;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("miaomiao");
    }

    @Override
    public void getAnimalName() {
        System.out.println("cat");
    }
}
