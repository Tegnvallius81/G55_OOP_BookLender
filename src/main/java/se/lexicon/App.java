package se.lexicon;

import se.lexicon.model.Person;
import se.lexicon.model.Book;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Middagsakuten", "Sven Andersson");
        Person person = new Person("Christian", "Tegnvallius");




        System.out.println(book.getBookInformation());
        System.out.println(person.getPersonInformation());


        person.loanBook(book);
        System.out.println(book.getBookInformation());

        person.returnBook(book);
        System.out.println(book.getBookInformation());
    }
}
