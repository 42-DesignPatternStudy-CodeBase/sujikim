package iteratorPattern.example.menu;

public class _Main {

    public static void main(String[] args) {

        FoodCourt foodCourt = new FoodCourt();

        foodCourt.printAllMenu();
        System.out.println();
        foodCourt.printVegetarianMenu();
    }
}
