package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookRepository {

    private final Connection connection;

    public BookRepository(Connection connection) {
        this.connection = connection;
    }

    // INSERT
    public void create(String title, int pages, double price, int authorId) {

        String sql = """
            INSERT INTO books (title, pages, price, author_id)
            VALUES (?, ?, ?, ?)
        """;

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, title);
            ps.setInt(2, pages);
            ps.setDouble(3, price);
            ps.setInt(4, authorId);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SELECT (نمایش در خروجی)
    public void readAll() {

        String sql = """
            SELECT
                b.id,
                b.title,
                b.pages,
                b.price,
                a.name AS author
            FROM books b
            JOIN authors a ON b.author_id = a.id
            ORDER BY b.id
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n📚 Book List:");
            System.out.println("---------------------------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getInt("pages") + " pages | $" +
                                rs.getDouble("price") + " | " +
                                rs.getString("author")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
