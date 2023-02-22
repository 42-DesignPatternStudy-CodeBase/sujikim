package templateMethodPattern.example.caffeine;

public class _Main {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println();
        System.out.println("... 홍차 준비중 ...");
        tea.prepareRecipe();
        System.out.println();
        System.out.println("... 커피 준비중 ...");
        coffee.prepareRecipe();
        
    }
}
