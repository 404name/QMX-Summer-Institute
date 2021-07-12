package com.qmx.work2;

public class Ball extends Circle
{

    public double getValume()
    {
        return getArea()*r*4/3;
    }
    public Ball()
    {
        super();
    }
    public Ball(double r)
    {
        super(r);
    }
}
