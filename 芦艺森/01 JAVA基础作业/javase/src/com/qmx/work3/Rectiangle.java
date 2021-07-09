package com.qmx.work3;

//Rectiangle类具有类型double的长、宽、面积和周长属性，具有修改长和宽功能，并实现抽象类的2个方法
public class Rectiangle extends Shape {
    public double Length;
    public double Width;
    private double Area;
    private double Perimeter;


    public void setArea(double area) {
        Area = area;
    }

    public void setPerimeter(double perimeter) {
        Perimeter = perimeter;
    }

    public Rectiangle(double length, double width) {
        Length = length;
        Width = width;
        setArea(length * width);
        setPerimeter((Length + width) * 2);
    }

    public void SetLength(double length) {
        Length = length;
        setArea(Length * Width);
        setPerimeter((Length + Width) * 2);
    }

    public void SetWidth(double width) {
        Width = width;
        setArea(Length * Width);
        setPerimeter((Length + Width) * 2);
    }

    @Override
    public double getArea() {
        return Area;
    }

    @Override
    public double getPerimeter() {
        return Perimeter;
    }

}
