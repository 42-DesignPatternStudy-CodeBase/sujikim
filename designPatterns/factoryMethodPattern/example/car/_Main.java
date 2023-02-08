package factoryMethodPattern.example.car;

public class _Main {

    public static void main(String[] args) {
        CarFactory factory = new HyundaiFactory();
        Car car = factory.produceCar("Sonata");

        System.out.println(car);
    }

}