package com.qmx.work2;

import jdk.nashorn.internal.parser.JSONParser;

public class MainClass {
    public static void main(String[] args) {
        Ball ball = new Ball(3);
        Cone cone = new Cone(3,3);
        Cylinder cylinder = new Cylinder(3,3);
        System.out.println(ball.getValume());
        System.out.println(cone.getValume());
        System.out.println(cylinder.getValume());
    }
}
