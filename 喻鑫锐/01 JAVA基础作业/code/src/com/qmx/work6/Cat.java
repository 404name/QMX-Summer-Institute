package com.qmx.work6;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("猫猫在哭");
    }

    @Override
    public void getAnimalName() {
        System.out.println("猫");
    }
}
