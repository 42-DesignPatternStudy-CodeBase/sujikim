package templateMethodPattern.example.caffeine;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");    
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput("커피에 우유와 설탕을 넣을까요? (y/n)? ");
        return answer.toLowerCase().startsWith("y");
    }
}
