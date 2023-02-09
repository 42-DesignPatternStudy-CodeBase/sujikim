package factoryMethodPattern.example.car;

public class _Main {

    public static void main(String[] args) {
        
        CarFactory factory = new SonataFactory();
        // Sonata 대신 Genesis를 생산하게 되면 factory만 수정하면 됨

        Car car = factory.produceCar();
        System.out.println(car);
    }

}