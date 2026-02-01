package service;

import repository.BookRepository;

public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public void addBooks() {
        repo.create("Clean Code", 464, 45.99, 1);
        repo.create("Clean Architecture", 432, 49.99, 1);
        repo.create("Effective Java", 416, 55.00, 2);
        repo.create("Java Concurrency in Practice", 384, 60.00, 2);
        repo.create("Refactoring", 448, 52.50, 3);
        repo.create("Patterns of Enterprise Application Architecture", 560, 58.75, 3);
    }

    public void showBooks() {
        repo.readAll();
    }
}
