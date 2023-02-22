package observerPattern.example.number;

public class _Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);

        generator.execute();        
        generator.execute();
        generator.execute();
        generator.execute();
        generator.execute();   
    }
}