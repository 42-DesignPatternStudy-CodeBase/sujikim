package abstractFactoryPattern.example.pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createCheesePizza() {
        return new NYCheesePizza();
    }

    @Override
    public Pizza createPepperoniPizza() {
        return new NYPepperoniPizza();
    }

    @Override
    public Pickle createPickle() {
        return new NYPickle();
    }
    
}
