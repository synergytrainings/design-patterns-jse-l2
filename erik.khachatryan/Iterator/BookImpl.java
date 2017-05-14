package com.synisys.erik.model;

/**
 * Created by Erik on 5/1/2017.
 */
public class BookImpl implements Book {
    private String author;
    private String title;
    private Integer publishYear;

    public BookImpl(String author, String title, Integer publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public BookImpl() {}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{\n\tauthor=" + this.author + ",\n\ttitle=" + this.title + ",\n\tpublishYear=" + this.publishYear + "\n}";
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        if(object == null || !object.getClass().equals(this.getClass())) {
            return false;
        }
        Book book = (Book)object;
        return this.author.equals(book.getAuthor()) && this.title.equals(book.getTitle()) && this.publishYear.equals(book.getPublishYear());
    }

    @Override
    public int hashCode() {
        return this.author.hashCode() + this.getTitle().hashCode() + this.publishYear.hashCode();
    }

}
