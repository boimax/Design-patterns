public abstract class CondimentDecorator extends Beverage {
    /**
     * 1 ly coffe đã có topping Milk, muốn decorate thêm topping Mocha, thì
     * CondimentDecorator wraps lại
     * ly đang có Milk, và cho thêm topping Mocha
     * ==>> Phải USES beverage lại
     */
    Beverage beverage;

    public abstract double cost();
}
