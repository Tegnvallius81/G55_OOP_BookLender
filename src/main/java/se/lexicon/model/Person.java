package se.lexicon.model;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private int getNextId() {
        return ++sequencer;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setBorrower(this);
            System.out.println(firstName + " borrowed " + book.getBookInformation());
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setBorrower(null);
            System.out.println(firstName + " returned " + book.getBookInformation());
        }
    }

    public String getPersonInformation() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName;
    }
}

