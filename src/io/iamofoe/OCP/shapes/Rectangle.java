package io.iamofoe.OCP.shapes;

import io.iamofoe.OCP.Shape;

public class Rectangle implements Shape {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public double getArea() {
        return (length * height);
    }
}
