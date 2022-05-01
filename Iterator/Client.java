import iterator.ItemIterator;
import iterator.IteratorType;

public class Client {
    public static <T> void main(String[] args) {
        NameRepoConcrete<String> items = new NameRepoConcrete<>();

        items.addItem("nnthuytien");
        items.addItem("Sori");
        items.addItem("Boi");
        items.addItem("Tuong");

        System.out.println("=================Left to Right Iterator================");
        ItemIterator<String> leftToRight = items.getIterator(IteratorType.LeftToRightIterator);
        for (ItemIterator<String> i = leftToRight; i.hasNext();) {
            System.out.println(i.next());
        }

        System.out.println("=================Right to Left Iterator================");
        ItemIterator<String> rightToLeft = items.getIterator(IteratorType.RightToLeftIterator);
        for (ItemIterator<String> i = rightToLeft; i.hasNext();) {
            System.out.println(i.next());
        }

        System.out.println("=================Alphatbet order Iterator================");
        ItemIterator<String> alphabetOrder = items.getIterator(IteratorType.AlphabetOrderIterator);
        for (ItemIterator<String> i = alphabetOrder; i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
