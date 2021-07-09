package com.qmx.work6;

public class Dog implements Animal{
    private String name;

    @Override
    public void cry() {
        System.out.println("wangwang");
    }

    @Override
    public void getAnimalName() {
        System.out.println("dog");
    }

}
