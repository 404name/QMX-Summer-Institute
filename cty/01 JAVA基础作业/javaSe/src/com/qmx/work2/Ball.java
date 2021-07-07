package com.qmx.work2;

public class Ball extends Circle {

    public Ball(int r) {
        super(r);
    }

    public int getValue(){
        return getR() * getR() * 3;
    }

}
