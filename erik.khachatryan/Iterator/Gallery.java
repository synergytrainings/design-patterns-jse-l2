package com.synisys.erik.model;

import com.synisys.erik.iterator.IterableGallery;

/**
 * Created by Erik on 5/1/2017.
 */
public interface Gallery extends IterableGallery {
    Book[] getBooks();

    void setBooks(Book[] books);

    Book getBook(int index);

    boolean remove(Book book);

    void add(Book book);
}
