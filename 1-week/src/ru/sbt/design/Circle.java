package ru.sbt.design;

public class Circle implements Figure{
    private double r;
    public Circle(double r) {
        if(r < 0) throw new IllegalArgumentException("r must be >= 0");
        this.r = r;
    }
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
