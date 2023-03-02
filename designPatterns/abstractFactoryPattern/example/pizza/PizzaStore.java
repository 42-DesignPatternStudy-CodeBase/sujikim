package abstractFactoryPattern.example.pizza;

public abstract class PizzaStore {
    
    public abstract Pizza createCheesePizza();
    public abstract Pizza createPepperoniPizza();
    public abstract Pickle createPickle();
}
