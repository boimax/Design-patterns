package iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class RightToLeftIterator<T> implements ItemIterator<T> {
    private List<T> items;
    private int position;

    public RightToLeftIterator(List<T> items) {
        this.items = items;
        this.position = items.size() - 1;
    }

    @Override
    public boolean hasNext() {
        if (position >= 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public T next() {
        if (hasNext()) {
            return items.get(position--);
        } else {
            throw new NoSuchElementException();
        }
    }

}
