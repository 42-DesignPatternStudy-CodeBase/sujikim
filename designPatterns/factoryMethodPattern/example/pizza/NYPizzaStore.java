package factoryMethodPattern.example.pizza;
// concreteCreator
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza() {
        return new NYCheesePizza();
    }
}
