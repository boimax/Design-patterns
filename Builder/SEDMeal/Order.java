import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> itemsList = new ArrayList<Item>();
    private double totalCost = 0;

    public void add(Item item) {
        itemsList.add(item);
    }

    public double getTotalCost() {
        for (Item item : itemsList) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        String s = "Order: ";
        for (Item item : itemsList) {
            s += item.getName() + " ";
        }
        s += "\nTotal cost: " + getTotalCost();
        return s;
    }

}
