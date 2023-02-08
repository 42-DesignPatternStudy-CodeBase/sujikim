// concreteCreator
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String name) {

        if (name == "cheese")
            return new NYCheesePizza();
        else if (name == "pepperoni")
            return new NYPepperoniPizza();

        return null;
    }
    
    
}
