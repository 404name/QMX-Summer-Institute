package com.qmx.work6;

public class Simulator implements Animal {
    String name;
    void playSound(Animal animal) {
        animal.cry(animal.getAnimalName());
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void cry(String name) {
        System.out.println(name);
    }

    @Override
    public String getAnimalName() {
        return name;
    }
}
