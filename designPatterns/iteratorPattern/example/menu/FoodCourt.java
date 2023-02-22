package iteratorPattern.example.menu;

public class FoodCourt {
    private PancakeMenuVendor breakFast = new PancakeMenuVendor();
    private DinerMenuVendor lunch = new DinerMenuVendor();
    private CafeMenuVendor cafe = new CafeMenuVendor();

    public void printAllMenu() {
        System.out.println("<< 모든 메뉴 >>");
        printBreakfastMenu(false);
        printLunchMenu(false);
        printCafeMenu();
    }

    public void printVegetarianMenu() {
        System.out.println("<< 채식 메뉴 >>");
        printBreakfastMenu(true);
        printLunchMenu(true);
        printCafeMenu();

    }

    private void printBreakfastMenu(boolean isForVegetarian) {
        ClassicIterator breakfastIterator = breakFast.createIterator();
        System.out.println("---- 아침 메뉴");
        printMenu(breakfastIterator, isForVegetarian);
    }
    private void printLunchMenu(boolean isForVegetarian) {
        ClassicIterator lunchIterator = lunch.createIterator();
        System.out.println("---- 점심 메뉴");
        printMenu(lunchIterator, isForVegetarian);
    }
    private void printCafeMenu() {
        ClassicIterator cafeIterator = cafe.createIterator();
        System.out.println("---- 카페 메뉴");
        printMenu(cafeIterator, false);
    }

    private void printMenu(ClassicIterator iterator, boolean isForVegetarian) {
        while(!iterator.isDone()) {
            MenuItem item = iterator.currentItem();

            if (!isForVegetarian || item.isVegetarian()) {
                System.out.print(item.getName() + ", ");
                System.out.print(item.getPrice() + " -- ");
                System.out.println(item.getDescription());
            }
            iterator.next();
        }
    }
}
