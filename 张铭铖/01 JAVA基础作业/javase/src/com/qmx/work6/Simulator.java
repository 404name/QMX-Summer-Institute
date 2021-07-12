package com.qmx.work6;

public class Simulator {//模拟器类
    public void playSound(Animal animal){
        System.out.println("物种:"+animal.getAnimalName());
        System.out.println("声音:"+animal.cry());
    }
}
