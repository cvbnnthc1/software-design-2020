package ru.sbt.design;

public class Rectangle implements Figure {
    private double a;
    private double b;
    public Rectangle(double a, double b) {
        if(a < 0 || b < 0) throw new IllegalArgumentException("a and b must be >= 0");
        this.a = a;
        this.b = b;
    }

    public double calculateArea() {
        return a * b;
    }
}
