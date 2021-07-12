package com.qmx.work3;

public class Application {
    public static void main(String[] args) {
        Shape obj = new Rectiangle(10,10);//实现多态性
        System.out.println("长方形的面积与周长:"+obj.getArea()+","+obj.getPerimeter());
        obj = new Circle(10);//实现多态性
        System.out.println("圆的面积与周长:"+obj.getArea()+","+obj.getPerimeter());
    }
}
