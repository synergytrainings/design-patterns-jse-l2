package com.synisys.erik.iterator;

import com.synisys.erik.model.Book;
import com.synisys.erik.model.GalleryImpl;

/**
 * Created by Erik on 5/1/2017.
 */
public class GalleryIteratorImpl implements GalleryIterator {
    private GalleryImpl galleryImpl;
    private int index;

    public GalleryIteratorImpl(GalleryImpl galleryImpl) {
        this.galleryImpl = galleryImpl;
        index = 0;
    }

    public boolean hasNext() {
        return index < galleryImpl.getBooks().length;
    }

    public Book next() {
        return galleryImpl.getBooks()[index++];
    }

}
