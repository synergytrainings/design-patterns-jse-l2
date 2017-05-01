package com.synisys.erik.model;

import com.synisys.erik.iterator.GalleryIterator;
import com.synisys.erik.iterator.GalleryIteratorImpl;
import com.synisys.erik.iterator.IterableGallery;
import com.synisys.erik.model.Book;

/**
 * Created by Erik on 5/1/2017.
 */
public class GalleryImpl implements Gallery {
    private Book[] books;


    public GalleryImpl(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return this.books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public GalleryIterator getIterator() {
        return new GalleryIteratorImpl(this);
    }
}
