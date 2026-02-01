package service;

import model.Book;
import repository.BookRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LibraryService {
    private final BookRepository repo = new BookRepository();

    public void addBook(Book book) {
        book.validate();
        repo.save(book);
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public List<Book> removeDuplicates(List<Book> books) {
        Set<String> seen = new HashSet<>();
        return books.stream()
                .filter(book -> seen.add(book.getIsbn()))
                .collect(Collectors.toList());
    }

    public Book getMostExpensiveBook(List<Book> books) {
        return books.stream()
                .max((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()))
                .orElse(null);
    }
}
