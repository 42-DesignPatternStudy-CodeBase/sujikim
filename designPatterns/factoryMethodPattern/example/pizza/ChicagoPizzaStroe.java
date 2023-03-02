package factoryMethodPattern.example.pizza;

public class ChicagoPizzaStroe extends PizzaStore {
    
    @Override
    public Pizza createPizza() {
        return new ChicagoCheesePizza();
    }
}
