package com.synisys.erik;

import com.synisys.erik.iterator.GalleryIterator;
import com.synisys.erik.model.Book;
import com.synisys.erik.model.BookImpl;
import com.synisys.erik.model.GalleryImpl;

/**
 * Created by Erik on 5/1/2017.
 */
public class Program {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        for (int i = 1; i <= books.length; i++) {
            books[i-1] = new BookImpl("author" + i, "title" + i, 2000 + i);
        }
        GalleryImpl gallery = new GalleryImpl(books);
        GalleryIterator galleryIterator = gallery.getIterator();
        while (galleryIterator.hasNext()) {
            System.out.println(galleryIterator.next());
        }
    }
}
