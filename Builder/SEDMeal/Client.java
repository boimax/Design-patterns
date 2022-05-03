public class Client {
    public static void main(String[] args) {
        Item mc1 = new Item("Chicken Burger", 20);
        Item mc2 = new Item("Vegan Burger", 15);
        Item b1 = new Item("Coke", 5);
        Item b2 = new Item("Apple Juice", 5);

        /**
         * Order: Chicken Burger Coke Vegan Burger
         * Total cost: 40.0
         */
        Order order = new OneCourseMealBuilder().mainCourse(mc1).beverage(b1).mainCourse(mc2).build();
        System.out.println(order);

        /**
         * Order: Chicken Burger Apple Juice Vegan Burger
         * Total cost: 36.5
         */
        Order order2 = new NoSaltOneCourseMealBuilder().mainCourse(mc1).beverage(b2).mainCourse(mc2).build();
        System.out.println(order2);
    }
}
