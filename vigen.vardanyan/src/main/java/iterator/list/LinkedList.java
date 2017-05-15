package main.java.iterator.list;

import main.java.iterator.Iterator;
import main.java.iterator.IteratorImpl;

/**
 * Created by Vigen.Vardanyan on 5/15/2017.
 */
public class LinkedList<T> implements List<T> {
    private int index;
    private int size;
    private Node firstNode;
    private Node lastNode;

    public LinkedList() {
        this.index = 0;
        this.size = 0;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(T value) {
        if (firstNode == null) {
            new Node(null, value);
            firstNode = new Node(null, value);
            size++;
        } else if (lastNode == null) {
            lastNode = new Node(firstNode, value);
            size++;
        } else {
            Node temp = new Node(lastNode.prev, lastNode.value);
            lastNode = new Node(temp, value);
            size++;
        }
    }

    @Override
    public Iterator getIterator() {
        return new IteratorImpl<>(this, size, index);
    }

    public class Node {
        private Node prev;
        private T value;

        private Node(Node prev, T value) {
            this.prev = prev;
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public T getValue() {
            return value;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}
