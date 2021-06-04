package com.epam.test.automation.java.practice5;

import java.util.Arrays;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;

    public ArrayRectangles(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        this.rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles(Rectangle... rectangleArray) {
        if (rectangleArray == null) {
            throw new IllegalArgumentException();
        }
        this.rectangleArray = Arrays.copyOf(rectangleArray, rectangleArray.length);
    }

    public Rectangle[] getRectangleArray() {
        return Arrays.copyOf(this.rectangleArray, this.rectangleArray.length);
    }

    public boolean addRectangle(Rectangle rectangle) {
        boolean isAdded = false;
        if (rectangle != null) {
            for (int i = 0; i < this.rectangleArray.length; i++) {
                if (this.rectangleArray[i] == null) {
                    this.rectangleArray[i] = new Rectangle(rectangle.getSideA(), rectangle.getSideB());
                    isAdded = true;
                    break;
                }
            }
        }
        return isAdded;
    }

    public int numberMaxArea() {
        double maxArea = 0;
        int maxIndex = 0;
        for (int i = 0; i < this.rectangleArray.length; i++) {
            if (this.rectangleArray[i] != null) {
                double currentArea = this.rectangleArray[i].area();
                if (currentArea > maxArea) {
                    maxArea = currentArea;
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }

    public int numberMinPerimeter() {
        double minPerimeter = this.rectangleArray[0] != null ? this.rectangleArray[0].perimeter() : 0;
        int minIndex = 0;
        for (int i = 1; i < this.rectangleArray.length; i++) {
            if (this.rectangleArray[i] != null) {
                double currentPerimeter = this.rectangleArray[i].perimeter();
                if (currentPerimeter < minPerimeter) {
                    minPerimeter = currentPerimeter;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }

    public int numberSquares() {
        int countOfSquares = 0;
        for (int i = 0; i < this.rectangleArray.length; i++) {
            if (rectangleArray[i] != null && rectangleArray[i].isSquare()) {
                countOfSquares++;
            }
        }
        return countOfSquares;
    }
}