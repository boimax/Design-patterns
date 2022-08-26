package iterator;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Concrete Iterators implement specific algorithms for traversing a collection.
 * The iterator object should track the traversal
 * progress on its own. This allows several iterators to traverse
 * the same collection independently of each other
 */
public class LeftToRightIterator<T> implements ItemIterator<T> {
    private List<T> items; // don't know type
    private int pointer = 0; // current position of item

    public LeftToRightIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (pointer < items.size()) {
            return true;
        } else
            return false;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return items.get(pointer++);
        } else {
            throw new NoSuchElementException();
        }
    }

}
