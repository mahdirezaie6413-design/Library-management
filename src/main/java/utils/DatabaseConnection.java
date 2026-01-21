package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // آدرس اتصال به دیتابیس PostgreSQL و نام دیتابیس SimpleDB
    private static final String URL = "jdbc:postgresql://localhost:5432/library-management";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                // اتصال با استفاده از آدرس، نام کاربری و رمز عبور جدید
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            return connection;
        } catch (SQLException e) {
            // در صورت بروز خطا در اتصال، این بخش اجرا می‌شود
            throw new RuntimeException("Database connection failed", e);
        }
    }
}