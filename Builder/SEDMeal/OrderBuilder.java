public interface OrderBuilder {
    OrderBuilder mainCourse(Item mainCourse);

    OrderBuilder beverage(Item beverage);

    Order build();
}
