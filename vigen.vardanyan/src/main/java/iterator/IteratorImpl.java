package main.java.iterator;


import main.java.iterator.list.LinkedList;

import java.util.ConcurrentModificationException;

/**
 * Created by Vigen.Vardanyan on 5/15/2017.
 */
public class IteratorImpl<T> implements Iterator {
    private LinkedList<T>.Node next;
    private LinkedList<T>.Node current;
    private LinkedList<T>.Node previous;
    private LinkedList<T> list;
    private int size;
    private Integer index;

    public IteratorImpl(LinkedList<T> list, int size, int index) {
        this.list = list;
        this.next = list.getLastNode();
        this.size = size;
        this.index = index;
    }

    @Override
    public boolean hasPrev() {
        return next != null;
    }

    @Override
    public T prev() {
        if (size == list.getSize()) {
            previous = current;
            current = next;
            next = next.getPrev();
            return current.getValue();
        } else throw new ConcurrentModificationException();
    }

    @Override
    public void remove() {
        if (current.getPrev() == null) {
            previous.setPrev(null);
        } else if (previous == null) {
            current.setPrev(null);
        } else {
            previous.setPrev(next);
        }
    }

    @Override
    public T get() {
        return current.getValue();
    }

    @Override
    public boolean hasNext() {
        if (index < list.getSize()) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        if (this.hasNext()) {
            return index++;
        }
        return null;
    }

}
