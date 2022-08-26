import iterator.ItemIterator;
import iterator.IteratorType;

/**
 * This is iterable collection. The Collection interface declares one or
 * multiple methods for getting iterators compatible with the collection. Note
 * that the return type of the methods must be declared as the iterator
 * interface so that the concrete collections can return various
 * kinds of iterators.
 */
public interface NameRepoInterface<T> {
    public void addItem(T item);

    public ItemIterator<T> getIterator(IteratorType type);
}
