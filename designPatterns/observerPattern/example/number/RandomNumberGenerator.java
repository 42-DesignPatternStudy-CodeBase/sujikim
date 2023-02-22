package observerPattern.example.number;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private int number;
    
    public RandomNumberGenerator() {
        execute();
    }
    public int getNumber() {
        return number;
    }
    
    public void execute() {
        Random random = new Random();
        number = random.nextInt(0, 10);
        notifyObservers();
    } 
}