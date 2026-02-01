package controller;

import model.Book;
import service.LibraryService;

import java.util.List;

public class LibraryController {
    private final LibraryService service;

    public LibraryController(LibraryService service) {
        this.service = service;
    }

    public void addBook(Book book) {
        service.addBook(book);
    }

    public void showBooks() {
        List<Book> books = service.getAllBooks();
        books.forEach(Book::printInfo);
    }

    public void showMostExpensive(List<Book> books) {
        Book expensive = service.getMostExpensiveBook(books);
        if (expensive != null) {
            System.out.printf("\n💰 Most expensive book: \"%s\" ($%.2f) by %s%n",
                    expensive.getTitle(), expensive.getPrice(), expensive.getAuthor());
        }
    }
}
