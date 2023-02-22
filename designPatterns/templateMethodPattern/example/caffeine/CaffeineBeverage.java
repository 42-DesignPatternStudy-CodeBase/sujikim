package templateMethodPattern.example.caffeine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverage {

    public final void prepareRecipe () {
        // template method
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    public abstract void brew();
    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("물 끓이는 중");
    }
    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    public boolean customerWantsCondiments() {
        // hook method
        return true;
    }

    protected String getUserInput(String questionMessage) {
        String answer = null;

        System.out.print(questionMessage);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO 오류");
        }
        return answer == null ? "no" : answer;
    }
}