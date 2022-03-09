package io.iamofoe.ISP.pets;

import io.iamofoe.ISP.behaviors.Barkable;

public class Dog implements Barkable,Runnable{

    @Override
    public void bark() {
        System.out.println("Loud barking noise..");
    }
    @Override
    public void run() {
        System.out.println("Lazy running unless there is food.");
    }
}
