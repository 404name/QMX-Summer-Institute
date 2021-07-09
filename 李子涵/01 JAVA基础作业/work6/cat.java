package com.qmx.work6;

public class cat implements Animal{
    @Override
    public void cry() {
        System.out.println("喵喵喵~");
    }

    @Override
    public void getAnimalName() {
        System.out.println("我是一只小猫子");
    }
}
