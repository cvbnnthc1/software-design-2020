package ru.sbt.design;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void calculateAreaSuccessful() {
        Circle circle = new Circle(30);
        double expected = 900 * Math.PI;
        assertEquals(expected, circle.calculateArea(), 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void createRectangleFail() {
        Circle circle = new Circle(-2);
    }
}