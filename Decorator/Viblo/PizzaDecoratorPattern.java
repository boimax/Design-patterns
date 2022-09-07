/*
 * DECORATOR PATTERN: attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
 * 5 MAIN PARTS: 
 * - interface Component: doOperation();
 * 
 * - concrete Component: each has its own doOperation() implementation;
 * 
 * - decorator ABSTRACT CLASS implements interface Component: 
 * + variable of interface: Composition
 * + doOperation(): variable above  will run doOperation()
 * 
 * - concrete decorator classes EXTENDS decorator abstract class: 
 * + constructor (interface variable)
 * + doOperation(): each has its own implementation, with new features added
 */
public class PizzaDecoratorPattern {
    public interface Pizza {
        String doPizza();
    }

    static class TomatoPizza implements Pizza {

        @Override
        public String doPizza() {
            return "Tomato Pizza";
        }

    }

    static class ChickenPizza implements Pizza {

        @Override
        public String doPizza() {
            return "Chicken Pizza";
        }

    }

    static abstract class PizzaDecorator implements Pizza { // MOST IMPORTANT ABSTRACT CLASS
        Pizza pizza; // INTERFACE + COMPOSITION: has old pizza inside decorator class to be ready for
                     // being decorated with new features MOST IMPORTANT 1

        public PizzaDecorator(Pizza pizza) {
            this.pizza = pizza;
        }

        @Override
        public String doPizza() { // doPizza before being decorated
            return pizza.doPizza();
        }

    }

    static class PepperDecorator extends PizzaDecorator {
        public PepperDecorator(Pizza pizza) { // MOST IMPORTANT 2: Constructor to put decorated Pizza to decorate with
                                              // new properties
            super(pizza); // Put into pizza at PizzaDecorator class to make it run doPizza() before being
                          // decorated with new taste
        }

        @Override
        public String doPizza() { // decorate pizza with new properties
            String result = super.doPizza() + " + Pepper";
            return result;
        }

    }

    static class CheeseDecorator extends PizzaDecorator {
        public CheeseDecorator(Pizza pizza) {
            super(pizza);
        }

        @Override
        public String doPizza() {
            String result = super.doPizza() + " + Cheese";
            return result;
        }
    }

    public static void main(String[] args) {
        // new taste = new newTasteClass(new old Pizza)
        PepperDecorator pepperDecorator = new PepperDecorator(new TomatoPizza());
        System.out.println(pepperDecorator.doPizza());

        CheeseDecorator cheeseDecorator = new CheeseDecorator(pepperDecorator);
        System.out.println(cheeseDecorator.doPizza());
    }
}
