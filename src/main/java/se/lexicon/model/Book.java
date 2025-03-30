package se.lexicon.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    public Book(String title, String author) {
        this.id = generateId();
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        this.borrower = borrower;
        this.available = false;
    }

    private String generateId() {
        return "BOOK-" + System.currentTimeMillis();
    }

    public String getBookInformation() {
        return "Title: " + title + ", Author: " + author + ", Available: " + available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        this.available = (borrower == null);
    }
}
