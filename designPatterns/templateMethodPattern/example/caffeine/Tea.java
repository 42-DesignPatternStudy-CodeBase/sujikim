package templateMethodPattern.example.caffeine;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("찻잎을 우려내는 중");    
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬을 우려내는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput("차에 레몬을 넣을까요? (y/n)? ");
        return answer.toLowerCase().startsWith("y");
    }
}
