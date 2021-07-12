//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.qmx.work3;

public class Rectiangle extends Shape {
    public double Length;
    public double Width;
    private double Area;
    private double Perimeter;

    public void setArea(double area) {
        this.Area = area;
    }

    public void setPerimeter(double perimeter) {
        this.Perimeter = perimeter;
    }

    public Rectiangle(double length, double width) {
        this.Length = length;
        this.Width = width;
        this.setArea(length * width);
        this.setPerimeter((this.Length + width) * 2.0D);
    }

    public void SetLength(double length) {
        this.Length = length;
        this.setArea(this.Length * this.Width);
        this.setPerimeter((this.Length + this.Width) * 2.0D);
    }

    public void SetWidth(double width) {
        this.Width = width;
        this.setArea(this.Length * this.Width);
        this.setPerimeter((this.Length + this.Width) * 2.0D);
    }

    public double getArea() {
        return this.Area;
    }

    public double getPerimeter() {
        return this.Perimeter;
    }
}
