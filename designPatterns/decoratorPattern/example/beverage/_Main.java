package decoratorPattern.example.beverage;

public class _Main {

    public static void printMenu(Beverage beverage) {
        System.out.println(beverage.getDescription() + "\t" + beverage.cost() + "$");
    }

    public static void main(String[] args) {
        Beverage order1 = new Espresso();
        printMenu(order1);

        Beverage order2 = new Espresso();
        order2 = new VanillaSyrup(order2);
        order2 = new Whip(order2);
        printMenu(order2);

        Beverage order3 = new Latte();
        order3 = new VanillaSyrup(order3);
        printMenu(order3);
    }
}
