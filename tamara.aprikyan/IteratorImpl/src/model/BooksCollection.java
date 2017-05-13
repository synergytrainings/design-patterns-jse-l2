package model;

/**
 * Created by TOM RED on 13.05.2017.
 */
public interface BooksCollection extends Iterable {
    public void addBook(Book book);
    public void removeBook(Book book);
}
