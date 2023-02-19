package myList;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
    private LinkedNode<T> head, tail;

    public void add(T data) {
        LinkedNode<T> node = new LinkedNode<>(this.head, data, null);
        if (head == null)
            head = tail = node;
        else {
            tail.setPrevious(head);
            tail.setNext(node);
            tail = node;
        }
    }

    public LinkedNode<T> getHead() {
        return head;
    }

    public LinkedNode<T> getTail() {
        return tail;
    }

    @Override
    public MyIterator<T> iterator() {
        return new ListIterator<T>(this);
    }


}
