package com.qmx.work6;

public class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("一起喵喵喵喵喵~");
    }

    @Override
    public void getAnimalName() {
        System.out.println("我们一起学猫叫~");
    }
}
