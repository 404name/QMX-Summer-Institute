package com.qmx.work6;

import com.sun.javaws.IconUtil;

public class Simulator implements Animal{
    public void playSound(Animal animal){
        animal.cry();
        animal.getAnimalName();
    }

    @Override
    public void cry() {
        System.out.println("叫声");
    }

    @Override
    public void getAnimalName() {
        System.out.println("名字");
    }
}
