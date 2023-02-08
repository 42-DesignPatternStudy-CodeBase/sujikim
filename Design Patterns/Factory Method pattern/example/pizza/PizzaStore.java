// creator
public abstract class PizzaStore {
    // factory method
    public abstract Pizza createPizza(String name);
    
    public Pizza orderPizza(String name) {
        Pizza pizza = this.createPizza(name);
        pizza.prepare();
        return pizza;
    }   
}
