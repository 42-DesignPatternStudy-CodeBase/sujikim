package observerPattern.example.number;

public class DigitObserver implements Observer {

    private int num;

    @Override
    public void update(NumberGenerator generator) {
        num = generator.getNumber();
        display();
    }

    public void display() {
        System.out.println("디지털 옵저버 : " + String.format("%10d", num));
    }

}