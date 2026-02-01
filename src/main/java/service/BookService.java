package service;

import model.Book;
import repository.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository repo = new BookRepository(); // ✅ بدون آرگومان

    public void addBook(Book book) {
        book.validate();
        repo.save(book);
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }
}
