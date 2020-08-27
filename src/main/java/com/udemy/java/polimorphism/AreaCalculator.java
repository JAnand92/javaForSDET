package com.udemy.java.polimorphism;

public class AreaCalculator {

    /*Area of square*/
    public int getArea(int size) {
        return size*size;
    }

    public double getArea(double size) {
        return size * size;
    }

    public int getArea(int a, int b) {
        return  a*b;
    }
}
