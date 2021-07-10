package com.qmx.work6;

public class Simulator implements Animal{
    void playSound(Animal animal){
        animal.getAnimalName();
        animal.cry();
    }
    @Override
    public void cry() {
    }

    @Override
    public void getAnimalName() {

    }
}
