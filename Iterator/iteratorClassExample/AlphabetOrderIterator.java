package iterator;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class AlphabetOrderIterator<T> implements ItemIterator<T> {
    private List<T> items;
    private int position = 0;

    public AlphabetOrderIterator(List<T> items) {
        this.items = items;
        Collections.sort((List<String>) items);
    }

    @Override
    public boolean hasNext() {
        if (position < items.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T next() {
        if (hasNext()) {
            return items.get(position++);
        } else {
            throw new NoSuchElementException();
        }
    }

}
