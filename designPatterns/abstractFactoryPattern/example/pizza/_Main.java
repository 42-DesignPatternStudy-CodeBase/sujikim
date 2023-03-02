package abstractFactoryPattern.example.pizza;

public class _Main {

    public static void blindTest(PizzaStore pizzaStore) {

        Pizza cheesePizza = pizzaStore.createCheesePizza();
        Pizza pepperoniPizza = pizzaStore.createPepperoniPizza();
        Pickle pickle = pizzaStore.createPickle();
        
        cheesePizza.displayMakingProcess();
        System.out.println("------------------------");
        pepperoniPizza.displayMakingProcess();
        System.out.println("------------------------");
        pickle.displayDescription();
        System.out.println("========================");
    }
    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();
        blindTest(pizzaStore);
        PizzaStore pizzaStore2 = new ChicagoPizzaStroe();
        blindTest(pizzaStore2);
    }
}
