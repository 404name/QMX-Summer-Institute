package com.qmx.work6;

public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        Cat cat = new Cat();
        Dog dog = new Dog();
        simulator.playSound(cat);
        simulator.playSound(dog);
    }
}
