package decoratorPattern.example.beverage;

public abstract class CodimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
