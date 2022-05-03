import Type.BreadType;
import Type.OrderType;
import Type.SauceType;
import Type.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder breadType(BreadType breadType);

    OrderBuilder sauceType(SauceType sauceType);

    OrderBuilder vegetableType(VegetableType vegetableType);

    Order build(); // because return to a new Order()

}
