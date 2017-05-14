package com.synisys.erik.iterator;

import com.synisys.erik.model.Book;

import java.util.Iterator;

/**
 * Created by Erik on 5/1/2017.
 */
public interface GalleryIterator extends Iterator<Book> {
    boolean hasNext();

    Book next();

    void remove();
}
