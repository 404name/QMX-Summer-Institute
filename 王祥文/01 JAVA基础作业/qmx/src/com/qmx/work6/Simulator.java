package com.qmx.work6;

public class Simulator implements Animal{

    public void playSound(Animal animal) {
        animal.cry();
        animal.getAnimalName();
    }

    @Override
    public void cry() {

    }

    @Override
    public void getAnimalName() {

    }
}
