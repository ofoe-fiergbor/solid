package io.iamofoe.OCP.shapes;

import io.iamofoe.OCP.Shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
