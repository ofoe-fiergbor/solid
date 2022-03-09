package io.iamofoe.OCP;

import io.iamofoe.OCP.shapes.Circle;
import io.iamofoe.OCP.shapes.Rectangle;

public class App {
    public static void main(String[] args) {
        AreaService service = new AreaService();

        double area = service.computeArea(new Circle(5.20));
        System.out.println("Area for the circle is "+area);

        double rectangleArea = service.computeArea(new Rectangle(5.00, 9.00));
        System.out.println("Area for the rectangle is "+rectangleArea);


    }
}
