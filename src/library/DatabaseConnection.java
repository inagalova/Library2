package library;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection connection = null;

    public void createConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://77.77.151.91:5432/library", "ina.galova", "w@(^d$G5");
            if(connection != null) {
                System.out.println("Database connected!");
            } else {
                System.out.println("Database connection error");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
