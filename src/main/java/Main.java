import repository.BookRepository;
import service.BookService;
import utils.DatabaseConnection;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {

        Connection connection = DatabaseConnection.getConnection();

        if (connection == null) {
            System.out.println("❌ Database connection failed");
            return;
        }

        System.out.println("✅ Database connected successfully");

        BookRepository repository = new BookRepository(connection);
        BookService service = new BookService(repository);

        // ⚠️ فقط یک‌بار اجرا کن، بعد کامنتش کن
        // service.addBooks();

        service.showBooks();
    }
}
