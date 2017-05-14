package com.synisys.erik;

import com.synisys.erik.iterator.GalleryIterator;
import com.synisys.erik.model.Book;
import com.synisys.erik.model.BookImpl;
import com.synisys.erik.model.Gallery;
import com.synisys.erik.model.GalleryImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Erik on 5/1/2017.
 */
public class Program {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        for (int i = 1; i <= books.length; i++) {
            books[i - 1] = new BookImpl("author" + i, "title" + i, 2000 + i);
        }
        Book book = books[2];
        Gallery gallery = new GalleryImpl(books);
        GalleryIterator galleryIterator = gallery.iterator();
        int index =0;
        while (galleryIterator.hasNext()) {
            if(index == 2) {
                gallery.add(new BookImpl("a1", "t1", 2001));
            }
            System.out.println(galleryIterator.next());
            galleryIterator.remove();
            index++;
        }
        System.out.println(gallery.getBooks().length);
        while (galleryIterator.hasNext()) {
            Book temp = galleryIterator.next();
            if(book.equals(temp)) {
                galleryIterator.remove();
                System.out.println("deleted book is {" + book + '}');
                gallery.add(new BookImpl("a6","t6",2016));
                gallery.add(new BookImpl("a7","t7",2017));
                continue;
            }
            System.out.println(temp);
        }
        for (Book book1 : gallery) {
            if (book.equals(book1)) {
                System.out.println("deleting remained ones");
                gallery.remove(books[3]);
                gallery.remove(books[4]);
                gallery.add(new BookImpl("author6", "title6", 2017));
            }
            System.out.println(book1);
        }
    }

}
