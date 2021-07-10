package com.qmx.work6;

public class Simulator {
    public void playSound(Animal animal){
        System.out.println(animal.getAnimalName());
        animal.cry();
    }
}