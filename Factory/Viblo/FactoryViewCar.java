/*
 * FACTORY PATTERN: is a factory that creates object based on our requirements
 * 4 MAIN PARTS: 
 * - interface: has view() method
 * - concrete classes of the interface: has its own view() method
 * - Factory class: create objects based on requirements
 * - Client: use Factory class to require to do sth 
 */
public class FactoryViewCar {
    public interface Car {
        void view();
    }

    static class Mercedes implements Car {

        @Override
        public void view() {
            System.out.println("Viewing Mercedes Car");
        }

    }

    static class BMW implements Car {

        @Override
        public void view() {
            System.out.println("Viewing BMW Car");

        }

    }

    static class Audi implements Car {

        @Override
        public void view() {
            System.out.println("Viewing Audi Car");

        }

    }

    static class CarFactory {
        public void viewCar(String carType) {
            Car car;// MOST IMPORTANT
            switch (carType) {
                case ("Mercedes"):
                    car = new Mercedes();
                    car.view();
                    break; // MOST IMPORTANT
                case ("BMW"):
                    car = new BMW();
                    car.view();
                    break;
                case ("Audi"):
                    car = new Audi();
                    car.view();
                    break;
                default:
                    System.out.println("Car not found");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.viewCar("Audi");
        carFactory.viewCar("Mercedes");
    }
}
