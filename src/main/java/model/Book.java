package model;

import service.interfaces.Validatable;

public class Book extends BaseEntity implements Validatable {
    private int pages;
    private double price;
    private String author;
    private String isbn;

    public Book(int id, String name, int pages, double price, String author, String isbn) {
        super(id, name);
        this.pages = pages;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    public int getPages() { return pages; }
    public double getPrice() { return price; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    // این متد از BaseEntity ارث‌بری شده:
    // public String getName() { return super.getName(); }

    @Override
    public void validate() {
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("❌ ISBN نباید خالی باشد");
        }
    }

    @Override
    public void printInfo() {
        System.out.printf("Book: %s | ISBN: %s | Pages: %d | Price: $%.2f | Author: %s%n",
                getName(), isbn, pages, price, author);
    }
}
