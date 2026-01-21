package service;

import model.Book;
import repository.BookRepository;

public class BookService {

    private final BookRepository repo = new BookRepository();

    public void addBook(Book book) {
        book.validate();
        repo.create(
                book.getTitle(),
                book.getPages(),
                book.getAuthor().getId()
        );
    }

    public void removeBook(int id) {
        repo.delete(id);
    }
}
