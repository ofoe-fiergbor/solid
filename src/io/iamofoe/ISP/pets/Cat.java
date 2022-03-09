package io.iamofoe.ISP.pets;

public class Cat implements Runnable{
    @Override
    public void run() {
        System.out.println("Walks like its on the runway...");
    }
}