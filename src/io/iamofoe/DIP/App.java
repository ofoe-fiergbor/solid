package io.iamofoe.DIP;

public class App {
    public static void main(String[] args) {

        DatabaseHandler databaseHandler = new DatabaseHandler(new MySQLDatabase());
        databaseHandler.connect();
        databaseHandler.disconnect();

    }
}
