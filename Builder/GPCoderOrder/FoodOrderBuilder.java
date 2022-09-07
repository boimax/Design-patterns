/*
 * 4 MAIN CLASSES:
 * 
 * 1. PRODUCT: Order()
 * 2. INTERFACE BUIDER: OrderBuilder()
 * 3. CONCRETE BUILDER: FastOrderConcreteBuilder()
 * 4. CLIENT
 */
public class FoodOrderBuilder {
    static class Order {
        private OrderType orderType;
        private BreadType breadType;
        private SauceType sauceType;
        private VegetableType vegetableType;

        public Order(OrderType orderType, BreadType breadType, SauceType sauceType, VegetableType vegetableType) {
            this.orderType = orderType;
            this.breadType = breadType;
            this.sauceType = sauceType;
            this.vegetableType = vegetableType;
        }

        @Override
        public String toString() {
            return "Order [breadType=" + breadType + ", orderType=" + orderType + ", sauceType=" + sauceType
                    + ", vegetableType=" + vegetableType + "]";
        }

    }

    public enum BreadType {
        SIMPLE, OMELETTE, FRIED_EGG, GRILLED_FISH, PORK, BEEF,
    }

    public enum OrderType {
        ON_SITE, TAKE_AWAY;
    }

    public enum SauceType {
        SOY_SAUCE, FISH_SAUCE, OLIVE_OIL, KETCHUP, MUSTARD;
    }

    public enum VegetableType {
        SALAD, CUCUMBER, TOMATO
    }

    public interface OrderBuilder {
        OrderBuilder setOrderType(OrderType orderType);

        OrderBuilder setBreadType(BreadType breadType);

        OrderBuilder setSauceType(SauceType sauceType);

        OrderBuilder setVegetableType(VegetableType vegetableType);

        Order build();
    }

    static class FastOrderConcreteBuilder implements OrderBuilder {
        private OrderType orderType;
        private BreadType breadType;
        private SauceType sauceType;
        private VegetableType vegetableType;

        @Override
        public OrderBuilder setBreadType(BreadType breadType) {

            this.breadType = breadType;
            return this;
        }

        @Override
        public OrderBuilder setOrderType(OrderType orderType) {

            this.orderType = orderType;
            return this;
        }

        @Override
        public OrderBuilder setSauceType(SauceType sauceType) {

            this.sauceType = sauceType;
            return this;
        }

        @Override
        public OrderBuilder setVegetableType(VegetableType vegetableType) {

            this.vegetableType = vegetableType;
            return this;
        }

        @Override
        public Order build() {

            return new Order(orderType, breadType, sauceType, vegetableType);
        }

    }

    public static void main(String[] args) {
        OrderBuilder fastFood = new FastOrderConcreteBuilder().setOrderType(OrderType.ON_SITE)
                .setBreadType(BreadType.OMELETTE).setSauceType(SauceType.FISH_SAUCE);
        System.out.println(fastFood.build());
    }
}
