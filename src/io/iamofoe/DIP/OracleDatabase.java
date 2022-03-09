package io.iamofoe.DIP;

public class OracleDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting Oracle database...");
    }
}
