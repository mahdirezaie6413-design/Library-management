package repository;

import exception.DatabaseOperationException;
import utils.DatabaseConnection;
import java.sql.*;

public class BookRepository {

    public void create(String title, int pages, int authorId) {
        String sql = "INSERT INTO books(title, pages, author_id) VALUES (?, ?, ?)";

        try (PreparedStatement ps =
                     DatabaseConnection.getConnection().prepareStatement(sql)) {
            ps.setString(1, title);
            ps.setInt(2, pages);
            ps.setInt(3, authorId);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseOperationException("Insert failed", e);
        }
    }

    public void getAll() {
        String sql = """
            SELECT b.id, b.title, a.name
            FROM books b JOIN authors a ON b.author_id = a.id
        """;

        try (PreparedStatement ps =
                     DatabaseConnection.getConnection().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getString("name")
                );
            }
        } catch (SQLException e) {
            throw new DatabaseOperationException("Fetch failed", e);
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM books WHERE id = ?";
        try (PreparedStatement ps =
                     DatabaseConnection.getConnection().prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseOperationException("Delete failed", e);
        }
    }
}
