public class _Main {
    
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        // 이사를 하면 간단히 NYPizzaStore 대신 ChicagoPizzaStore 등으로 바꾸기만 하면 됨

        Pizza todayLunch = pizzaStore.orderPizza("cheese");
        Pizza tomorrowLunch = pizzaStore.orderPizza("pepperoni");

    }
}
