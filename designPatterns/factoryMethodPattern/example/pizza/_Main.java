package factoryMethodPattern.example.pizza;

public class _Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.createPizza();
        
        pizza.displayMakingProcess();
        System.out.println("------------------------");

        PizzaStore pizzaStore2 = new ChicagoPizzaStroe();
        Pizza pizza2 = pizzaStore2.createPizza();

        pizza2.displayMakingProcess();
        System.out.println("------------------------");
    }
}
