/*
This component class can be used on its own, or wrapped by a decorator
*/
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
