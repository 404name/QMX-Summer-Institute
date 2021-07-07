package com.qmx.work2;

public class main {
    public static void main(String[] args) {
        Circle yuan = new Circle(10);
        yuan.setR(5);
        yuan.getArea();

        Ball qiu = new Ball(3);
        qiu.getValume();

        Cone yzhui = new Cone(1, 5);
        yzhui.showSelf();
        yzhui.getValume();
    }
}
