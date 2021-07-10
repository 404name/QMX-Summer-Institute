package com.qmx.work2;

import java.sql.SQLOutput;
import java.util.Scanner;

class Circle{
    protected double r;
    public Circle(double r){
        super();
        this.r = r;
    }
    public void setR(int r){
        this.r = r;
    }
    public double getArea(){
        return 3.14 * r * r;
    }
}
class Ball extends Circle{

    public Ball(double r) {
        super(r);
    }
    public double getValume(){
        return 3.14 * r * r * r * 4 /3;
    }
}
class Cone extends Circle{
    private double high;
    public Cone(double r,double high) {
        super(r);
        this.high = high;
    }
    public void setHigh(double high){
        this.high = high;
    }
    public double getValume(){
        return 3.14 * r * r * high / 3;
    }
}
class Cylindere extends Circle{
    private double high;
    public Cylindere(double r,double high) {
        super(r);
        this.high = high;
    }
    public void setHigh(double high){
        this.high = high;
    }
    public double getValume(){
        return 3.14 * r * r * high;
    }
}
public class Jihe {
    public static void main(String[] args) {
        double r, high;
        System.out.println("请输入半径r，高high");
        Scanner in = new Scanner(System.in);
        r = in.nextDouble();
        high = in.nextDouble();
        Circle A = new Circle(r);
        Ball B = new Ball(r);
        Cone C = new Cone(r,high);
        Cylindere D =new Cylindere(r,high);
        System.out.println("圆面积为："+A.getArea());
        System.out.println("球体积为："+B.getValume());
        System.out.println("圆锥体积："+ C.getValume());
        System.out.println("圆柱体积："+ D.getValume());
    }

}