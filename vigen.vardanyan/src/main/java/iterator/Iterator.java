package main.java.iterator;

/**
 * Created by Vigen.Vardanyan on 5/15/2017.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();

    boolean hasPrev();

    T prev();

    void remove();

    T get();
}
