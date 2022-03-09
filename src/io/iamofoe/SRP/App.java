package io.iamofoe.SRP;

public class App {
    public static void main(String[] args) {
        Magazine magazine = new Magazine(new Formatter(), new Printer());

        magazine.getFormatter().format();
        magazine.getPrinter().print();
    }
}
