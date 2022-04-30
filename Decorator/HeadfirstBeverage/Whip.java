public class Whip extends CondimentDecorator {
    /**
     * Beverage beverage: was initialized in CondimentDecorator, so it is not
     * necessary to initialize it again in concrete decorators
     */
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
        /**
         * wraps together with concrete beverage component method:
         * getDescription() & cost()
         **/
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

}
