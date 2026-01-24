package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {


    private static final String URL = "jdbc:postgresql://localhost:5432/library-management";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {

                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            return connection;
        } catch (SQLException e) {

            throw new RuntimeException("Database connection failed", e);
        }
    }
}