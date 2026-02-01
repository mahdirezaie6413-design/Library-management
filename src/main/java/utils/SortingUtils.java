package utils;

import model.Book;
import java.util.List;

public class SortingUtils {
    public static void sortBooksByTitle(List<Book> books) {
        books.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));
    }

    public static void sortBooksByPrice(List<Book> books) {
        books.sort((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
    }
}
