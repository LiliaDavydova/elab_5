package com.epam.test.automation.java.practice5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayRectanglesTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithNFailsWhenNLessThan0() {
        new ArrayRectangles(-1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithNFailsWhenNIs0() {
        new ArrayRectangles(0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFailsWhenArrayRectangleIsNull() {
        new ArrayRectangles(null);
    }

    @Test
    public void testAddRectangleNull() {
        ArrayRectangles rectangles = new ArrayRectangles(5);
        Assert.assertFalse(rectangles.addRectangle(null));
    }

    @Test
    public void testAddRectangle() {
        ArrayRectangles rectangles = new ArrayRectangles(3);
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(7, 8);
        rectangles.addRectangle(rectangle1);
        rectangles.addRectangle(rectangle2);
        Assert.assertEquals(rectangles.getRectangleArray()[0], rectangle1);
        Assert.assertEquals(rectangles.getRectangleArray()[1], rectangle2);
    }

    @Test
    public void testNumberMaxArea() {
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(7, 8);
        ArrayRectangles rectangles = new ArrayRectangles(rectangle1, null, rectangle2);
        Assert.assertEquals(rectangles.numberMaxArea(), 2);
    }

    @Test
    public void testNumberMaxArea0() {
        ArrayRectangles rectangles = new ArrayRectangles(null, null);
        Assert.assertEquals(rectangles.numberMaxArea(), 0);
    }

    @Test
    public void testNumberMinPerimeter() {
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(2, 3);
        ArrayRectangles rectangles = new ArrayRectangles(rectangle1, null, rectangle2);
        Assert.assertEquals(rectangles.numberMinPerimeter(), 2);
    }

    @Test
    public void testNumberMinPerimeter0() {
        ArrayRectangles rectangles = new ArrayRectangles(null, null);
        Assert.assertEquals(rectangles.numberMinPerimeter(), 0);
    }

    @Test
    public void testNumberSquares() {
        Rectangle rectangle1 = new Rectangle(5, 6);
        Rectangle rectangle2 = new Rectangle(3, 3);
        Rectangle rectangle3 = new Rectangle(2, 2);
        ArrayRectangles rectangles = new ArrayRectangles(rectangle1, null, rectangle2, rectangle3);
        Assert.assertEquals(rectangles.numberSquares(), 2);
    }

    @Test
    public void testNumberSquares0() {
        ArrayRectangles rectangles = new ArrayRectangles(null, null);
        Assert.assertEquals(rectangles.numberSquares(), 0);
    }
}