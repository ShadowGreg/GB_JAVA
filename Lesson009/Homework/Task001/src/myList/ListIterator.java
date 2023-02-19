package myList;

import java.util.Iterator;

public class ListIterator<T> implements MyIterator<T> {
    LinkedNode<T> current;

    public ListIterator(MyLinkedList<T> ts) {
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


    public boolean hasPrevious() {
        return current != null;
    }

    public T previous() {
        T data = current.getData();
        current = current.getPrevious();
        return data;
    }
}

