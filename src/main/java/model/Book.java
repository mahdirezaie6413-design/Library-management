package model;

public class Book {
    private int id;
    private String title;
    private int pages;
    private double price;
    private String author;
    private String isbn;

    public Book(int id, String title, int pages, double price, String author, String isbn) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public int getPages() { return pages; }
    public double getPrice() { return price; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    public void printInfo() {
        System.out.printf("📘 %s | %d pages | $%.2f | %s%n", title, pages, price, author);
    }

    public void validate() {
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("❌ ISBN نباید خالی باشد");
        }
    }
}
