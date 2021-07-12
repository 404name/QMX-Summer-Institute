package com.qmx.work2;

public class test2 {
    public static void main(String[] args) {
        double r = 1, high = 1;
        Ball b = new Ball(r);
        Cone c = new Cone(r, high) ;
        Cylinder d = new Cylinder(r, high);
        System.out.println(b.getValume());
        System.out.println(c.getValume());
        System.out.println(d.getValume());
    }
}
