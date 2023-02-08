package decoratorPattern.example.beverage;

public class Latte extends Beverage {

    public Latte() {
        description = "카페 라떼";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
