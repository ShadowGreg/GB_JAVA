package myList;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private Node<T> head, tail;

    public void add(T data) {
        Node<T> node = new Node<T>(data, null);
        if (head == null)
            head = tail = node;
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }

    public class ListIterator<T> implements Iterator<T> {
        Node<T> current;

        public ListIterator(MyList<T> ts) {
            current = ts.getHead();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }

    }
}