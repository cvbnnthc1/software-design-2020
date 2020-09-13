package ru.sbt.design;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void calculateAreaSuccessful() {
        Square square = new Square(30);
        double expected = 900;
        assertEquals(expected, square.calculateArea(), 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void createRectangleFail() {
        Square square = new Square(-2);
    }
}