import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import iterator.AlphabetOrderIterator;
import iterator.ItemIterator;
import iterator.IteratorType;
import iterator.LeftToRightIterator;
import iterator.RightToLeftIterator;

/**
 * Concrete Collections return new instances of a particular concrete iterator
 * class each time the client requests one.
 * 
 * @param <T>
 */

/**
 * This class will implement NameRepoIntreface and set up it
 * Using generic
 */
public class NameRepoConcrete<T> implements NameRepoInterface<T> {
    private List<T> items = new ArrayList<>();

    @Override
    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public ItemIterator<T> getIterator(IteratorType type) {
        ItemIterator<T> iterator = null;
        switch (type) {
            case LeftToRightIterator:
                iterator = new LeftToRightIterator<>(items);
                break;
            case RightToLeftIterator:
                iterator = new RightToLeftIterator<>(items);
                break;
            case AlphabetOrderIterator:
                iterator = new AlphabetOrderIterator<>(items);
                break;
            default:
                throw new NoSuchElementException();
        }
        return iterator;
    }

}
