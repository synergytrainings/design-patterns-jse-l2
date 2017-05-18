import java.util.NoSuchElementException;

/**
 * Created by aramc on 5/18/2017.
 */
public class List {
    private ListNode first;

    public List() {
        this.first = null;
    }

    public void add(int value) {
        if (this.first == null) {
            this.first = new ListNode(value);
        } else {
            this.first.add(value);
        }
    }

    public void print() {
        this.first.print();
    }

    public ListIterator getIterator() {
        return new ListIterator();
    }

    public class ListIterator {
        private ListNode node;

        public ListIterator() {
            this.node = List.this.first;
        }

        public boolean hasNext() {
            return this.node != null;
        }

        public int next() {
            if (this.node == null) {
                throw new NoSuchElementException();
            } else {
                int value = this.node.getValue();

                this.node = this.node.next;

                return value;
            }
        }
    }

    public static class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
            this.next = null;
        }

        public void add(int value) {
            if (this.next == null) {
                this.next = new ListNode(value);
            } else {
                this.next.add(value);
            }
        }

        public void print() {
            ListNode node = this;

            while (node != null) {
                System.out.println(node.value);
                node = node.next;
            }
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }
}
