package com.qmx.work2;

public class Application {
    public static void main(String[] args) {
        Ball ball = new Ball(8);
        System.out.println(ball.getValue());
        Cone cone = new Cone(10,1);
        System.out.println(cone.getValue());
        Cylinder cylinder = new Cylinder(10,1);
        System.out.println(cylinder.getValue());
    }
}
