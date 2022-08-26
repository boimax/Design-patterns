package iterator;

/**
 * The Iterator interface declares the operations required for traversing a
 * collection
 */
public interface ItemIterator<T> {
    public boolean hasNext();

    public T next();
}
