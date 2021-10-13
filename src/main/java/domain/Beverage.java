package domain;

public abstract class Beverage {
    String description = "Unknown domain.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
