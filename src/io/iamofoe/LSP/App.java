package io.iamofoe.LSP;

import io.iamofoe.LSP.shapes.Rectangle;
import io.iamofoe.LSP.shapes.Square;

public class App {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);

        Square square = new Square(10);

        useShape(rectangle);
        useShape(square);

    }

    private static void useShape(Shape shape) {
        //use shape
        System.out.println(shape.computeArea());
    }
}
