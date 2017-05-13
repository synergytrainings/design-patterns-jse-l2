package impl;

import model.Book;
import model.BooksCollection;
import model.IterableBooks;

import java.util.*;

/**
 * Created by TOM RED on 09.05.2017.
 */
public class BooksCollectionImpl implements BooksCollection, IterableBooks {

    private ArrayList<Book> books = new ArrayList<>();


    @Override
    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        this.books.remove(book);
    }

    @Override
    public Iterator iterator() {
        return new BooksCollectionIterator();
    }

    private class BooksCollectionIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < books.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return books.get(index++);
            }
            return null;
        }
    }

    @Override
    public Iterator getBooksIterator() {
        return new BooksIterator();
    }


    /**
     * For traversal over sorted by year list of books
     */
    private class BooksIterator implements Iterator {

        private List<Book> sortedBooks = books;

        int index;

        public BooksIterator() {
            Collections.sort(sortedBooks, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getYear() - o2.getYear();
                }
            });
        }

        @Override
        public boolean hasNext() {
            if (index < books.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return books.get(index++);
            }
            return null;
        }
    }
}
