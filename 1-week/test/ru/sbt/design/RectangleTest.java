package ru.sbt.design;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void calculateAreaSuccessful() {
        Rectangle rectangle = new Rectangle(20, 30);
        double expected = 600;
        assertEquals(expected, rectangle.calculateArea(), 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void createRectangleFailFirstArgument() {
        Rectangle rectangle = new Rectangle(-2, 3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void createRectangleFailSecondArgument() {
        Rectangle rectangle = new Rectangle(2, -3);
    }
}