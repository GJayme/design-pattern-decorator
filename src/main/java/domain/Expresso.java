package domain;

public class Expresso extends Beverage{

    public Expresso() {
        description = "domain.Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}