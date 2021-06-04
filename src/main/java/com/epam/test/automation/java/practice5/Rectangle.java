package com.epam.test.automation.java.practice5;

import java.util.Objects;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException();
        }
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException();
        }
        this.sideA = a;
        this.sideB = 5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }


    public double getSideA() {
        return this.sideA;
    }


    public double getSideB() {
        return this.sideB;
    }


    public double area() {
        return this.sideA * this.sideB;
    }


    public double perimeter() {
        return (this.sideA + this.sideB) * 2;
    }


    public boolean isSquare() {
        return this.sideA == this.sideB;
    }


    public void replaceSides() {
        double temp = this.sideA;
        this.sideA = this.sideB;
        this.sideB = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 &&
                Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }
}