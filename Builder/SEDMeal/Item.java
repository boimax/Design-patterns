public class Item {
    private String name;
    private double cost;

    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    /**
     * this function is used in NoSaltOneCourseMealBuilder to reduce the cost of
     * each course
     */
    public void changeCost(double percent) {
        this.cost = (double) this.cost * percent;
    }
}
