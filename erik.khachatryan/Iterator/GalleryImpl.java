package com.synisys.erik.model;

import com.synisys.erik.iterator.GalleryIterator;
import com.synisys.erik.iterator.GalleryIteratorImpl;
import com.synisys.erik.model.Book;

/**
 * Created by Erik on 5/1/2017.
 */
public class GalleryImpl implements Gallery {
    private Book[] books = null;


    public GalleryImpl(Book[] books) {
        this.books = books;
    }

    public GalleryImpl() {
    }

    public Book[] getBooks() {
        return this.books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public GalleryIterator iterator() {
        return new GalleryIteratorImpl(this);
    }

    public Book getBook(int index) {
        if (index < this.books.length) {
            return this.books[index];
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean remove(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                Book[] temp = books;
                books = new Book[books.length - 1];
                int k = 0;
                for (int j = 0; j < temp.length; j++) {
                    if (j == i) {
                        continue;
                    }
                    books[k++] = temp[j];
                }
                return true;
            }
        }
        return false;
    }

    public void add(Book book) {
        if (books == null) {
            books = new Book[]{book};
            return;
        }
        Book[] temp = this.books;
        this.books = new Book[temp.length + 1];
        for (int i = 0; i < temp.length; i++) {
            books[i] = temp[i];
        }
        books[temp.length] = book;
    }
}
