package factoryMethodPattern.example.car;

public class SonataFactory extends CarFactory {

    @Override
    public Car produceCar() {
        return new Sonata();
    }    
}
