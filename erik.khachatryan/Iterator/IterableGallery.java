package com.synisys.erik.iterator;


import com.synisys.erik.model.Book;

/**
 * Created by Erik on 5/1/2017.
 */
public interface IterableGallery extends Iterable<Book> {
    GalleryIterator iterator();
}
