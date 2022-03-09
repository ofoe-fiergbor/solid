package io.iamofoe.SRP;

public class Magazine {
    private Formatter formatter;
    private Printer printer;

    public Magazine(Formatter formatter, Printer printer) {
        this.formatter = formatter;
        this.printer = printer;
    }

    public Formatter getFormatter() {
        return formatter;
    }

    public Printer getPrinter() {
        return printer;
    }
}
