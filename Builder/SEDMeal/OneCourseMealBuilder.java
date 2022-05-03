public class OneCourseMealBuilder implements OrderBuilder {
    /**
     * Creating new order() object to add item & build()
     */
    Order order = new Order();

    @Override
    public OrderBuilder mainCourse(Item mainCourse) {
        order.add(mainCourse);
        return this;
    }

    @Override
    public OrderBuilder beverage(Item beverage) {
        order.add(beverage);
        return this;
    }

    @Override
    public Order build() {
        return this.order;
    }

}
