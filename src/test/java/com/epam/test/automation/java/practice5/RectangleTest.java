package com.epam.test.automation.java.practice5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithAFailsWhenALessThan0() {
        new Rectangle(-1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithAFailsWhenAIs0() {
        new Rectangle(0);
    }

    @Test
    public void testConstructorWithA() {
        Rectangle rectangle = new Rectangle(8);
        Assert.assertEquals(rectangle.getSideA(), 8d);
        Assert.assertEquals(rectangle.getSideB(), 5d);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithAAndBFailsWhenALessThan0AndB() {
        new Rectangle(-1, 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithAAndBFailsWhenAIs0AndB() {
        new Rectangle(0, 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithAAndBFailsWhenBLessThan0AndA() {
        new Rectangle(2, -1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testConstructorWithAAndBFailsWhenBIs0AndA() {
        new Rectangle(2, 0);
    }

    @Test
    public void testConstructorWithNoParameters() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(rectangle.getSideA(), 4d);
        Assert.assertEquals(rectangle.getSideB(), 3d);
    }

    @Test
    public void testConstructorWithAAndB() {
        Rectangle rectangle = new Rectangle(3, 4);
        Assert.assertEquals(rectangle.getSideA(), 3d);
        Assert.assertEquals(rectangle.getSideB(), 4d);
    }

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        Assert.assertEquals(rectangle.area(), 12d);
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(3, 4);
        Assert.assertEquals(rectangle.perimeter(), 14d);
    }

    @Test
    public void testIsSquareTrue() {
        Rectangle rectangle = new Rectangle(4, 4);
        Assert.assertTrue(rectangle.isSquare());
    }

    @Test
    public void testIsSquareFalse() {
        Rectangle rectangle = new Rectangle(4, 2);
        Assert.assertFalse(rectangle.isSquare());
    }

    @Test
    public void testReplaceSidesTest() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.replaceSides();
        Assert.assertEquals(rectangle.getSideA(), 4d);
        Assert.assertEquals(rectangle.getSideB(), 3d);
    }
}