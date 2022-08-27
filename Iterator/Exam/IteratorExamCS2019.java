import java.util.*;

public class IteratorExamCS2019 {
    public interface Iterator {
        boolean hasNext();

        public int next(); // INT: KIEU DU LIEU INSERTED INTO ARRAYLIST LA INTERGER
    }

    static class ArrayListIterator implements Iterator {
        ArrayList<Integer> items;
        int position = 0;

        public ArrayListIterator(ArrayList<Integer> items) { //// USED TO PUT DATA INTO ARRAYLIST ITEMS
            this.items = items;
        }

        @Override
        public boolean hasNext() {
            if (position >= items.size() || items.get(position) == null) {
                return false;
            }
            return true;
        }

        @Override
        public int next() {
            if (hasNext()) {
                return items.get(position++);
            }
            return 0;
        }

    }

    public interface BoxContainer {
        Iterator getIterator();
    }

    static class IntegerBoxConcreteContainer implements BoxContainer {
        ArrayList<Integer> items = new ArrayList<Integer>(
                Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));

        @Override
        public Iterator getIterator() {
            return new ArrayListIterator(items);
        }

    }

    public static void main(String[] args) {
        IntegerBoxConcreteContainer boxContainer = new IntegerBoxConcreteContainer();
        Iterator arrayListIterator = boxContainer.getIterator();
        while (arrayListIterator.hasNext()) {
            int number = (int) arrayListIterator.next();
            System.out.println(number);
        }

    }
}
