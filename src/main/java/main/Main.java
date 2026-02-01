package main;

import controller.LibraryController;
import model.Book;
import service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LibraryService service = new LibraryService();
        LibraryController controller = new LibraryController(service);

        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Clean Code", 464, 45.99, "Robert C. Martin", "9780132350884"));
        books.add(new Book(2, "Effective Java", 416, 55.00, "Joshua Bloch", "9780134685991"));
        books.add(new Book(3, "Java Concurrency in Practice", 384, 60.00, "Guide van Rosssum", "9780321349606"));
        books.add(new Book(4, "Refactoring", 448, 52.50, "Martin Fowler", "9780201485677"));


        List<Book> uniqueBooks = service.removeDuplicates(books);

        for (Book book : uniqueBooks) {
            controller.addBook(book);
        }

        System.out.println("📚 Book List:");
        controller.showBooks();

        controller.showMostExpensive(uniqueBooks);
    }
}
