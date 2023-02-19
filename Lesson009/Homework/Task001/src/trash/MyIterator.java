package trash;

import java.util.Iterator;

public interface MyIterator<T> extends Iterator<T> {
    boolean hasPrevious();

    T previous();

}
