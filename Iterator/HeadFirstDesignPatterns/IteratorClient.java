
/*
 * This example is taken from Head First Desgin Pattern Book 
 * Used Iterator Pattern to implement with 5 MAIN PARTS:
 * 1. Iterator interface: hasNext() and next() methods
 * 2. Concrete Iterators: constructor + hasNext() and next() methods with its own implementation
 * 3. Container interface: 1 getIterator() method
 * 4. Concrete Containers: with its own getIterator() setting
 * 5. Client: initialize concrete containers + concrete iterators (by using container.getIterator())
 */
import java.util.*;

public class IteratorClient {

    public interface Iterator {
        // NOT NEED CURRENT() AS NEXT() WILL RETURN CURRENT ITEMS[POSITION]
        public boolean hasNext();

        public String next(); // BECAUSE INPUT VALUE INTO LIST + ARRAYLIST: STRING
    }

    static class DinerMenuConcreteIterator implements Iterator {
        String[] items; // DINER MENU ITERATOR USES STRING[]
        int position = 0;

        public DinerMenuConcreteIterator(String[] items) {// USED TO PUT MENU'S DATA INTO STRING[] LIST
            this.items = items;
        }

        @Override
        public boolean hasNext() {
            if (position >= items.length || items[position] == null) {
                return false;
            }
            return true;
        }

        @Override
        public String next() {
            if (this.hasNext()) { // RETURN CURRENT ITEMS[POSITION] -> NOT NEED ADDITIONAL CURRENT() METHOD
                return items[position++];
            }
            return null;
        }

    }

    static class PancakeHouseMenuConcreteIterator implements Iterator {
        ArrayList<String> items; // PANCAKE HOUSE ITERATOR ITERATOR USES ARRAYLIST<STRING>
        int position = 0;

        public PancakeHouseMenuConcreteIterator(ArrayList<String> items) { // USED TO PUT MENU'S DATA INTO ARRAYLIST
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
        public String next() { // RETURN CURRENT ITEMS[POSITION] -> NOT NEED ADDITIONAL CURRENT() METHOD
            if (this.hasNext()) {
                return items.get(position++);
            }
            return null;
        }

    }

    public interface MenuContainer { // CONTAINER INTERFACE ALWAYS JUST HAVE 1 METHOD: getIterator
        public Iterator getIterator();
    }

    static class DinerMenuConcreteContainer implements MenuContainer {
        public String dinerMenuItems[] = { "Vege", "Soup", "Hotdog", "Pasta" }; // USED FOR ITEMS[] LIST IN
                                                                                // DinerMenuConcreteIterator class

        @Override
        public Iterator getIterator() {
            return new DinerMenuConcreteIterator(dinerMenuItems);
        }

    }

    static class PancakeHouseMenuConcreteContainer implements MenuContainer {
        ArrayList<String> pancakeHouseMenuItems = new ArrayList<String>(
                Arrays.asList("cake1",
                        "cake2",
                        "cake3")); // USED FOR ITEMS[] LIST IN PancakeHouseConcreteIterator class

        @Override
        public Iterator getIterator() {
            return new PancakeHouseMenuConcreteIterator(pancakeHouseMenuItems);
        }

    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String menuItem = (String) iterator.next();
            System.out.println(menuItem);
        }
    }

    public static void main(String[] args) {
        DinerMenuConcreteContainer dinerMenu = new DinerMenuConcreteContainer();
        PancakeHouseMenuConcreteContainer pancakeMenu = new PancakeHouseMenuConcreteContainer();

        Iterator dinerIterator = dinerMenu.getIterator();
        Iterator pancakeIterator = pancakeMenu.getIterator();

        printMenu(dinerIterator);
        printMenu(pancakeIterator);
    }

}
