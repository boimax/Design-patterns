public class Client {
    public static void main(String[] args) {
        // 1st: create new beverage withouth decorating any topping
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost()); // => Espresso Coffee $1.99

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost()); // Dark Roast Coffee, Mocha, Mocha,
                                                                                  // Whip $1.5399999999999998
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());// HouseBlend Coffee, Soy, Mocha, Whip
                                                                                 // $1.39
    }
}
