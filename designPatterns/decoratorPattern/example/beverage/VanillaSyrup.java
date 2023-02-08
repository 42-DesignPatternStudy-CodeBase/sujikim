package decoratorPattern.example.beverage;

public class VanillaSyrup extends CodimentDecorator {

    public VanillaSyrup(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 바닐라 시럽";
    }

    @Override
    public double cost() {
        return beverage.cost() + .50;
    }
    
}
