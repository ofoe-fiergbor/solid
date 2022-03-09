package io.iamofoe.ISP.pets;

import io.iamofoe.ISP.behaviors.Flyable;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Jet speed flight...");
    }

}
