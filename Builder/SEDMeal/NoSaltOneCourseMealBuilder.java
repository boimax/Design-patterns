public class NoSaltOneCourseMealBuilder implements OrderBuilder {
    /**
     * Creating new noSaltOrder() object to add item & build()
     */

    Order noSaltOrder = new Order();

    @Override
    public OrderBuilder mainCourse(Item mainCourse) {
        mainCourse.changeCost(0.9);
        noSaltOrder.add(mainCourse);
        return this;
    }

    @Override
    public OrderBuilder beverage(Item beverage) {
        noSaltOrder.add(beverage);
        return this;
    }

    @Override
    public Order build() {
        return this.noSaltOrder;
    }

}
