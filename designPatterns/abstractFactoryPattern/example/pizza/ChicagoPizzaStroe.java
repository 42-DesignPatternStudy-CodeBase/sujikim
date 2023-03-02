package abstractFactoryPattern.example.pizza;

public class ChicagoPizzaStroe extends PizzaStore {
    
    @Override
    public Pizza createCheesePizza() {
        return new ChicagoCheesePizza();
    }

    @Override
    public Pizza createPepperoniPizza() {
        return new ChicagoPepperoniPizza();
    }

    @Override
    public Pickle createPickle() {
        return new ChicagoPickle();
    }
}
