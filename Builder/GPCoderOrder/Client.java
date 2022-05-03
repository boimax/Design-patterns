import Type.BreadType;
import Type.OrderType;
import Type.SauceType;
import Type.VegetableType;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder().orderType(OrderType.ON_SITE).breadType(BreadType.OMELETTE)
                .sauceType(SauceType.SOY_SAUCE).build();
        /**
         * Order [orderType=ON_SITE, breadType=OMELETTE, sauceType=SOY_SAUCE,
         * vegetableType=null]
         */
        System.out.println(order);

        Order order2 = new FastFoodOrderBuilder().orderType(OrderType.TAKE_AWAY).sauceType(SauceType.FISH_SAUCE)
                .vegetableType(VegetableType.SALAD).breadType(BreadType.BEEF).build();

        /**
         * Order [orderType=TAKE_AWAY, breadType=BEEF, sauceType=FISH_SAUCE,
         * vegetableType=SALAD]
         */
        System.out.println(order2);
    }
}
