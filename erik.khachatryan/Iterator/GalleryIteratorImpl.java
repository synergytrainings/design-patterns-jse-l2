package com.synisys.erik.iterator;

import com.synisys.erik.model.Book;
import com.synisys.erik.model.Gallery;

/**
 * Created by Erik on 5/1/2017.
 */
public class GalleryIteratorImpl implements GalleryIterator {
    private Gallery gallery;
    private int index;
    private boolean removed = false;

    public GalleryIteratorImpl(Gallery gallery) {
        this.gallery = gallery;
    }

    public boolean hasNext() {
        return index < gallery.getBooks().length;
    }

    public Book next() {
        if (hasNext()) {
            removed = false;
            return gallery.getBooks()[index++];
        }
        throw new UnsupportedOperationException("getting next");
    }

    public void remove() {
        if (!removed && index > 0) {
            Book book = gallery.getBooks()[--index];
            if (gallery.remove(book)) {
                removed = true;
                return;
            }
            throw new UnsupportedOperationException("remove");
        }
        throw new IllegalStateException("Must call next() before calling remove().");
    }

}
