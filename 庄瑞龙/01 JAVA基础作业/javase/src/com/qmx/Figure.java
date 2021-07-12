package com.qmx;

public abstract class Figure {
    double a, b;
    Figure(double a, double b){
        this.a = a;
        this.b = b;
    }
    public abstract double area();
}
 class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }
    public double area(){
        System.out.println("长方形的面积：");
        return a * b;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    public double area(){
        System.out.println("三角形的面积： ");
        return a * b / 2;
    }
}
class test{
    public static void main(String[] args) {
        Figure a = new Rectangle(2, 5);
        System.out.println(a.area());
        a = new Triangle(3, 4);
        System.out.println(a.area());
    }
}