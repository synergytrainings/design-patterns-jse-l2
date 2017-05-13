import impl.BooksCollectionImpl;
import model.Book;
import model.BooksCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by TOM RED on 04.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        BooksCollectionImpl booksCollection = new BooksCollectionImpl();
        booksCollection.addBook(new Book("White Fang", "Jack London", 1906));
        booksCollection.addBook(new Book("The lord of the rings", "Tolkien", 1955));
        booksCollection.addBook(new Book("The Hobbit", "Tolkien", 1937));

        //Internal iterator
        for (Object book : booksCollection) {
            System.out.println((Book) book);
        }

        //External iterator
        Iterator iterator = booksCollection.getBooksIterator();

        System.out.println("----------------------------------------");

        while (iterator.hasNext()) {
            System.out.println((Book) iterator.next());
        }
    }
}
